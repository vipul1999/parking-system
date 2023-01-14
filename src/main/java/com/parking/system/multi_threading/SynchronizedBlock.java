package com.parking.system.multi_threading;

class Counter{
    int count = 0;
    public final Object lock = new Object();
    public void increment(){
        synchronized (lock) {
            count++;
        }
    }
    public int getCount(){
        return count;
    }
    public void setCount(int count){
        synchronized (lock){
            this.count = count;
        }
    }

}
public class SynchronizedBlock {

    public static void main(String[] args) throws InterruptedException {
        //there will be a thread that will call incrment method 1K time
        Counter counter  = new Counter();
        int unmatchedResultCount = 0;
        for(int i=0;i<1000;i++){
            int n = 1000;
            int m = 2000;
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<n;i++){
                        counter.increment();
                    }
                }
            });
            //there will be another thread that will call increment method 2K time
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<m;i++){
                        counter.increment();
                    }
                }
            });
            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();
            if(counter.getCount()!=(n+m)){
                unmatchedResultCount++;
            }
            counter.setCount(0);
        }

        System.out.println("UnmatchedResult count is: "+unmatchedResultCount);
    }


}
