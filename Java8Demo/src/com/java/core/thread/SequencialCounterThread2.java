package com.java.core.thread;

public class SequencialCounterThread2 implements Runnable {
	 private volatile Integer count;
	    private volatile Integer threadIdToRun;
	    private Object object;
	    private int threadId;

	public SequencialCounterThread2(int threadId, Integer threadIdToRun, Object object, int i) {
            super();
            this.count=count;
            this.threadIdToRun=threadIdToRun;
            this.object=object;
            this.threadId=i;
        }

	 @Override
     public void run() {
         try {
             while (this.count <= 20) {
                 synchronized (this.object) {
                     if (threadId != threadIdToRun) {
                         object.wait();
                     } else {
                         System.out.println("Thread " + threadId + " printed " + count);
                         count += 1;

                         if (threadId == 1)
                             threadIdToRun = 2;
                         else if (threadId == 2)
                             threadIdToRun = 3;
                         else if (threadId == 3)
                             threadIdToRun = 1;

                         object.notifyAll();
                     }
                 }
             }
         } catch (Exception e) {
             e.printStackTrace();
         }

     }
}
