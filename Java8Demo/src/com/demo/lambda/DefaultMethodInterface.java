/**
 * 
 */
package com.demo.lambda;

/**
 * @author kvasim
 *
 */
public interface DefaultMethodInterface {
	
	default String defaultMethod(){
		return "This is default method in interface";
	}

}
