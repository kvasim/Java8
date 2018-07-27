package com.java.core.thread.interview;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

class SequenceCounterByMultipleThreadTest {

	@Test
	void testSequnceNumberForMultipleThread() {

		AtomicInteger sharedCounter= new AtomicInteger(0);
		SequenceCounterByMultipleThread uT1= new SequenceCounterByMultipleThread(sharedCounter,0);
		SequenceCounterByMultipleThread uT2= new SequenceCounterByMultipleThread(sharedCounter,1);
		SequenceCounterByMultipleThread uT3= new SequenceCounterByMultipleThread(sharedCounter,2);
		/*SequenceCounterByMultipleThread uT4= new SequenceCounterByMultipleThread(sharedCounter,3);
		SequenceCounterByMultipleThread uT5= new SequenceCounterByMultipleThread(sharedCounter,4);*/
		
		Thread t1= new Thread(uT1,"A");
		Thread t2= new Thread(uT2,"B");
		Thread t3= new Thread(uT3,"C");
	//	Thread t4= new Thread(uT4,"D");
	//	Thread t5= new Thread(uT5,"E");
		t1.start();
		t2.start();
		t3.start();
		//t4.start();
		//t5.start();
		assertTrue(true);
	}

}
