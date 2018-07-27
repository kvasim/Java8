package com.java8.lambda;

import java.util.function.Supplier;

public class DefaultMethodInterfaceDemo {

	public static void main(String[] args) {

		Defaulable defaulable=DefaultFactory.create(DefaultableImpl::new);
		System.out.println(defaulable.notRequired());
		
		Defaulable def= DefaultFactory.create(OverridableImpl::new);
		System.out.println(defaulable.notRequired());
	}

	
}
	interface Defaulable{
		default String notRequired() {
			return "Default Implementation";
		}
	
}
	class DefaultableImpl implements Defaulable {
		}
	class OverridableImpl implements Defaulable {
		    @Override
		    public String notRequired() {
		        return "Overridden implementation";
		    }
}
	interface DefaultFactory{
		static Defaulable create(Supplier<Defaulable> supplier) {
			return supplier.get();
		}
	}