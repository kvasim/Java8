package com.java.core.thread.test;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import com.java.core.thread.SequencialCounterThread1;
import com.java.core.thread.SequencialCounterThread2;

class TestSequencialCounterThread {

	AtomicInteger counter = new AtomicInteger(0);

	//@Test
	void testSequencialCounter() {

		SequencialCounterThread1 sT1 = new SequencialCounterThread1(counter, 0);
		Thread t1 = new Thread(sT1, "Th1");
		SequencialCounterThread1 sT2 = new SequencialCounterThread1(counter, 1);
		Thread t2 = new Thread(sT2, "Th2");
		SequencialCounterThread1 sT3 = new SequencialCounterThread1(counter, 2);
		Thread t3 = new Thread(sT3, "Th3");
		t1.start();
		t2.start();
		t3.start();
		System.out.println(" Main Thread finished");
	}

	@Test
	void testSequencialCounter2() {
		Integer count = 1;
		Integer threadIdToRun = 1;
		Object object = new Object();

		SequencialCounterThread2 sT1 = new SequencialCounterThread2(count,threadIdToRun,object,1);
		Thread t1 = new Thread(sT1, "Th1");
		SequencialCounterThread2 sT2 = new SequencialCounterThread2(count,threadIdToRun,object,2);
		Thread t2 = new Thread(sT2, "Th2");
		SequencialCounterThread2 sT3 = new SequencialCounterThread2(count,threadIdToRun,object,3);
		Thread t3 = new Thread(sT3, "Th3");
		t1.start();
		t2.start();
		t3.start();
		System.out.println(" Main Thread finished");
	}

}
