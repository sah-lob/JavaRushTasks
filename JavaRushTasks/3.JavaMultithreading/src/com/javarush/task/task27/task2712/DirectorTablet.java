package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.Advertisement;
import com.javarush.task.task27.task2712.ad.StatisticAdvertisementManager;
import com.javarush.task.task27.task2712.statistic.StatisticManager;

import java.util.List;
import java.util.Map;

public class DirectorTablet {


    public void printAdvertisementProfit(){
        Map<String, Double> map = StatisticManager.getInstance().getStatisticForShownAdvertisement();

        double totalAmount = 0;
        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            totalAmount += entry.getValue();
            String str = entry.getKey() + " - " + String.format("%.2f", entry.getValue());
            str = str.replaceAll(",",".");
            ConsoleHelper.writeMessage(str);
        }

        String str = String.format("Total - %.2f", totalAmount);
        str = str.replaceAll(",",".");

        ConsoleHelper.writeMessage(str);
    }
    public void printCookWorkloading(){
        Map<String, Map<String, Integer>> map = StatisticManager.getInstance().getStatisticForCooks();

        for (Map.Entry<String, Map<String, Integer>> entry1 : map.entrySet())
        {
            ConsoleHelper.writeMessage(entry1.getKey());
            for (Map.Entry<String, Integer> entry2 : entry1.getValue().entrySet())
            {
                ConsoleHelper.writeMessage(entry2.getKey() + " - " + entry2.getValue() + " min");
            }
        }
    }
    public void printActiveVideoSet(){
        List<Advertisement> activeVideoSet = StatisticAdvertisementManager.getInstance().getVideoSet(true);
        for (Advertisement ad : activeVideoSet)
        {
            ConsoleHelper.writeMessage(ad.getName() + " - " + ad.getHits());
        }
    }
    public void printArchivedVideoSet(){
        List<Advertisement> activeVideoSet = StatisticAdvertisementManager.getInstance().getVideoSet(false);
        for (Advertisement ad : activeVideoSet)
        {
            ConsoleHelper.writeMessage(ad.getName());
        }
    }
}
