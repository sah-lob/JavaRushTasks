package com.javarush.task.task25.task2506;

public class LoggingStateThread implements Runnable {

    private final Thread target;


    public LoggingStateThread(Thread target) {
        this.target = target;
//        setDaemon(true);
    }

    public void run(){

//        State state = this.target.getState();
//        System.out.println(target.getState());
//        while (state != State.TERMINATED) {
//                state = this.target.getState();
//                System.out.println(state);
        }
    }

