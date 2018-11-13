package com.javarush.task.task27.task2712.ad;

import java.util.*;

public class StatisticAdvertisementManager {


    AdvertisementStorage advertisementStorage = AdvertisementStorage.getInstance();


    public List<Advertisement> getVideoSet(boolean isActive)
    {
        List<Advertisement> videoSet = new ArrayList<>();
        for (Advertisement ad : advertisementStorage.list())
        {
            if (!isActive && ad.getHits() == 0)
            {
                videoSet.add(ad);
            }
            if (isActive && ad.getHits() != 0)
            {
                videoSet.add(ad);
            }
        }
        Collections.sort(videoSet, new Comparator<Advertisement>()
        {
            @Override
            public int compare(Advertisement o1, Advertisement o2)
            {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return videoSet;
    }

    private static StatisticAdvertisementManager ourInstance = new StatisticAdvertisementManager();

    public static StatisticAdvertisementManager getInstance() {
        return ourInstance;
    }

    private StatisticAdvertisementManager() {
    }
}
