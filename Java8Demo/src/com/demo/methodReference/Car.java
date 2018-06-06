/**
 * 
 */
package com.demo.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author kvasim
 *
 */
public class Car {
	
	public static void main(String[] args){
		Car car= create(Car::new);
		final List<Car> cars= Arrays.asList(car);
		cars.forEach(Car::collide);
		cars.forEach(car::follow);
		cars.forEach(Car::repair);
	}
	
	

	public static Car create(Supplier<Car> supplier){
		return supplier.get();
	}
	
	public static void collide( final Car car ) {
		        System.out.println( "Collided " + car.toString() );
		  }
	
	 public void follow( final Car another ) {
		
		        System.out.println( "Following the " + another.toString() );
		
		    }
		    public void repair() {  
		
		        System.out.println( "Repaired " + this.toString() );
		
		    }
}
