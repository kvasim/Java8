package com.java.random;

public class SimpleRandom {

	/**
	 * Test code
	 */
	public static void main(String[] args) {
	    SimpleRandom rand = new SimpleRandom(10);
	    for (int i = 0; i < 25; i++) {
	        System.out.print(rand.nextInt()+" ");
	    }

	}

	private int max;
	private int last;

	// constructor that takes the max int
	public SimpleRandom(int max){
	    this.max = max;
	    long lValue=System.currentTimeMillis();
	    last = (int) (lValue % max);
	    System.out.println("--lValue-----:"+lValue);
	    System.out.println("--- last  --:"+last);
	}

	// Note that the result can not be bigger then 32749
	public int nextInt(){
	    last = (last * 32719 + 3) % 32749;
		 // last = (last * 45328 + 3) % 41981;
	    return last % max;
	}
}
