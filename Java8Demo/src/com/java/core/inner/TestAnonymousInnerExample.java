package com.java.core.inner;

public class TestAnonymousInnerExample {

	public static void main(String[] args) {

		Person p= new Person() {
			@Override
			void sayHi() {
				System.out.println("Hi.. This is person implementation");
			}
		};
		p.sayHi();
	}
}

abstract class Person{  
	  abstract void sayHi();  
	}  