package com.java.core.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
    	Lock lock= new ReentrantLock();
        //synchronized(this){
    	lock.lock();
            for(int i=0; i<100 ; i++){
                total += i;
          //  }
                lock.unlock();
            notify();
        }
        System.out.println(" Thread B is completed now");
    }
}