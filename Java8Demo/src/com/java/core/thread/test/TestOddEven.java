package com.java.core.thread.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.java.core.thread.EvenOdd;
import com.java.core.thread.EvenThreadImplementation;
import com.java.core.thread.OddThreadImplementation;

class TestOddEven {

	@Test
	void testOddEven() {
		EvenOdd evenOdd= new EvenOdd();
		EvenThreadImplementation evenThred=new EvenThreadImplementation(evenOdd);
		OddThreadImplementation oddThread= new OddThreadImplementation(evenOdd);
		Thread evenT= new Thread(evenThred);
		Thread oddT= new Thread(oddThread);
		evenT.start();
		oddT.start();
		System.out.println(" Main thread finished ");
		assertTrue(true);
	}

	//@Test
	void testOddEvenWithLambda() {
		EvenOdd evenOdd= new EvenOdd();
		/*EvenThreadImplementation evenThred=new EvenThreadImplementation(evenOdd);
		OddThreadImplementation oddThread= new OddThreadImplementation(evenOdd);*/
		Runnable evenThred=()->{
			try {
				evenOdd.printEven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Runnable oddThread=()->{
			try {
				evenOdd.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Thread evenT= new Thread(evenThred);
		Thread oddT= new Thread(oddThread);
		evenT.start();
		oddT.start();
		System.out.println(" Main thread finished ");
		assertTrue(true);
	}
	
}
