package com.javarush.task.task27.task2712;


import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.kitchen.Waiter;
import com.javarush.task.task27.task2712.statistic.StatisticManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class Restaurant {

    private static final int ORDER_CREATING_INTERVAL = 100;
    private static final LinkedBlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws IOException {

        List<Tablet> tablets = new ArrayList<>();

        Cook firstCook = new Cook("Amigo");
        firstCook.setQueue(orderQueue);
        Cook secondCook = new Cook("Виктор");
        secondCook.setQueue(orderQueue);

//        OrderManager orderManager = new OrderManager();

        StatisticManager.getInstance().register(firstCook);
        StatisticManager.getInstance().register(secondCook);



        for (int i = 0; i < 5; i++) {
            Tablet tablet = new Tablet(i+1);
//            tablet.addObserver(orderManager);
            tablet.setQueue(orderQueue);
            tablets.add(tablet);
        }

        RandomOrderGeneratorTask task = new RandomOrderGeneratorTask(tablets, ORDER_CREATING_INTERVAL);
        Thread orderThread = new Thread(task);
        orderThread.start();


        Thread fThread = new Thread(firstCook);
        Thread sThread = new Thread(secondCook);

        fThread.start();
        sThread.start();

        Waiter firstWaiter = new Waiter();




        firstCook.addObserver(firstWaiter);
        secondCook.addObserver(firstWaiter);




        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printActiveVideoSet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printArchivedVideoSet();
        directorTablet.printCookWorkloading();


        boolean isNotDone = true;
        while (isNotDone)
        {
            if (orderQueue.isEmpty())
            {
                fThread.interrupt();
                sThread.interrupt();
                isNotDone = false;
            }
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        orderThread.interrupt();
    }
}
