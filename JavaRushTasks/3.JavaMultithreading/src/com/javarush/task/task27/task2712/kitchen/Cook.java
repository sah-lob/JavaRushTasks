package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.LinkedBlockingQueue;

public class Cook extends Observable implements Runnable{

    private boolean busy;
    private LinkedBlockingQueue<Order> queue;
    private String name;
    private volatile boolean caught = false;

    public void setQueue(LinkedBlockingQueue<Order> queue) { this.queue = queue; }

    public Cook(String name) { this.name = name; }


    public void startCookingOrder(Order order)
    {
        busy=true;
        ConsoleHelper.writeMessage("Start cooking - " + order+", cooking time "+ order.getTotalCookingTime()+"min");
        StatisticManager.getInstance().register(new CookedOrderEventDataRow(order.getTablet().toString(), name,
                order.getTotalCookingTime() * 60, order.getDishes()));
        try {
            Thread.sleep(order.getTotalCookingTime() * 10);
        }
        catch (InterruptedException e) {
        }
        setChanged();
        notifyObservers(order);
        busy=false;
    }


    @Override
    public String toString()
    {
        return name;
    }


    public boolean isBusy() {
        return busy;
    }

    @Override
    public void run() {
        while (true) {
            try {
                startCookingOrder(queue.take());
            }
            catch (InterruptedException e) {}
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                busy = true;
            }
            if (busy && queue.isEmpty()) break;
        }
    }
}