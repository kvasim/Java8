/**
 * 
 */
package com.demo.lambda;

/**
 * @author kvasim
 *
 */
public class DemoClsForDefaultMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodInterface interface1= DefaulableFactory.create(DefaultImp::new);
		System.out.println(interface1.defaultMethod());
		
		interface1= DefaulableFactory.create(OverrideImp::new);
		System.out.println(interface1.defaultMethod());

	}

}
