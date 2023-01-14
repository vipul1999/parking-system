package com.parking.system.design_pattern;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){

    }
    public static ThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hey, I am threadSafeSingleTon class");
    }

    public static void main(String[] args){
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        threadSafeSingleton.showMessage();
    }

}
