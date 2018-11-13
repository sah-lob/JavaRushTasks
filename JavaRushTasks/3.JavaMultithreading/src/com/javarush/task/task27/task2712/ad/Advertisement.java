package com.javarush.task.task27.task2712.ad;

public class Advertisement {

    private Object content;     //            видео.
    private String name;        //            имя.
    private long initialAmount; //            стоимость рекламы.

    private int hits;           //            количество оплаченых показов.
    private int duration;       //            продолжительность.
    private long amountPerOneDisplaying;//    стоимость одного показа.

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        if(hits!=0){
        this.amountPerOneDisplaying = initialAmount/hits;}
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public void revalidate(){
        if(hits<=0) throw new UnsupportedOperationException();
        hits--;
    }

    public int getHits() {
        return hits;
    }

}
