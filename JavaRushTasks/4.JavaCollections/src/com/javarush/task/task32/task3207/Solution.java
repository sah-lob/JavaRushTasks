package com.javarush.task.task32.task3207;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/* 
К серверу по RMI
*/
public class Solution {

    public static final String UNIC_BINDING_NAME = "double.string";
    public static Registry registry;

    //pretend we start rmi client as CLIENT_THREAD thread
    public static Thread CLIENT_THREAD = new Thread(new Runnable() {

        @Override
        public void run() {
            try {
                DoubleString doubleString = (DoubleString) registry.lookup(UNIC_BINDING_NAME);
                String result = doubleString.doubleString("Привет");
                System.out.println(result);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(999);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    public static void main(String[] args) throws InterruptedException {
        //pretend we start rmi server as main thread
        Remote stub = null;
        try {
            registry = LocateRegistry.createRegistry(2099);
            final DoubleStringImpl service = new DoubleStringImpl();

            stub = UnicastRemoteObject.exportObject(service, 0);
            registry.bind(UNIC_BINDING_NAME, stub);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

        Thread.sleep(5000);
        //start client
        CLIENT_THREAD.start();
    }
}