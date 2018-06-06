/**
 * 
 */
package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author kvasim
 *
 */
public class Safelock {
	static class Friend{
		private final String name;
		
		private final Lock lock= new ReentrantLock();
		
		public Friend(String name){
			this.name=name;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		public boolean impendingBow(Friend bower){
			Boolean myLock=false;
			Boolean yrLock=false;
			try{
				myLock= lock.tryLock();
				yrLock= bower.lock.tryLock();
			}finally{
				if (! (myLock && yrLock)) {
                    if (myLock) {
                        lock.unlock();
                    }
                    if (yrLock) {
                        bower.lock.unlock();
                    }
                }
			}
			
			return myLock && yrLock;
		}
		
		public void bow(Friend bower){
			if(impendingBow(bower)){
				
				
			}
		}
		
		
	}

}
