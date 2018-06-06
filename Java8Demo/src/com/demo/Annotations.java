/**
 * 
 */
package com.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author KVASIM
 *
 */
public class Annotations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Holder<String> holder= new @NotEmpty Holder<String>();
		@NotEmpty Collection<@NotEmpty String> strings=new ArrayList<>();
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
	public @interface NotEmpty{
	}
	
	public static class Holder<@NotEmpty T> extends @NotEmpty Object{
		public void method() throws @NotEmpty Exception{
			
		}
	}
}
