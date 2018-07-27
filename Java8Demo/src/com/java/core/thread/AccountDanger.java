package com.java.core.thread;

public class AccountDanger implements Runnable {

	private Account account= new Account();
	public AccountDanger(String threadName){
		Thread t= new Thread(this,threadName);
		t.start();
	}
	
	@Override
	public void run() {

		for(int x=0;x<8;x++){
			makeWithdrawal(10);
			if(account.getBalance()<0){
				System.out.println(" Account is overdrawn ");
				
			}
		}
	}

	 private void makeWithdrawal(int amt) {
		 synchronized(this){

		if(account.getBalance()>=amt){
			System.out.println(Thread.currentThread().getName() +" is going to withdraw ");
			try{
				Thread.sleep(500);
			}catch(InterruptedException exp){
				exp.printStackTrace();
			}
			
			account.withDraw(amt);
			System.out.println(Thread.currentThread().getName()+" completes the withdrawl");
		}else{
			System.out.println(" Not enough money in account for "+Thread.currentThread().getName()+" to withdraw "+account.getBalance());
		}
		 }
	}

	public static void main(String[] args) {

		AccountDanger accountDanger= new AccountDanger("Fred");
		AccountDanger accountDanger2= new AccountDanger("Lucy");
		System.out.println(" Main thread finished ");
		
		
	}

}
