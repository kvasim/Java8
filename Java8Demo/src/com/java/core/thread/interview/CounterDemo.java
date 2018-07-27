package com.java.core.thread.interview;

import java.util.concurrent.Semaphore;

public class CounterDemo {

	public static void main(String[] args) throws InterruptedException {
		Semaphore semaphore= new Semaphore(1);
		Counter counter= new Counter();
		Thread t1= new Thread() {@Override
		public void run() {
			counter.increment();
		}
	};
	semaphore.acquire();
	t1.start();
	////////
	Thread t2= new Thread() {@Override
		public void run() {
			counter.increment();
		}
	};
	
	t2.start();
	///////////
	Thread t3= new Thread() {@Override
		public void run() {
			counter.increment();
		}
	};
	
	t3.start();
	//////////
	Thread t4= new Thread() {@Override
		public void run() {
			counter.increment();
		}
	};
	
	t4.start();
//////////
Thread t5= new Thread() {@Override
	public void run() {
	System.out.println(" Thsi is fifth thread");
		counter.increment();
		System.out.println("     -- "+counter.getNum());
	}
};
System.out.println("  Available "+semaphore.availablePermits());
t5.start();
semaphore.release();
	Thread.sleep(25);
	System.out.println("  output "+counter.getNum());
	
	}

}
