package com.java.core.inner;

public class TestAnnonymousWithInterface {

	public static void main(String[] args) {
		PersonI person= new PersonI() {
			@Override
			public void sayHi() {
				System.out.println(" Hi .. This is person interface implementation");
			}
		};
		person.sayHi();
	}
}
interface PersonI{  
	 void sayHi();  
	}  