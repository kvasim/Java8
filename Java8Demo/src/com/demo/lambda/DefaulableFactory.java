/**
 * 
 */
package com.demo.lambda;

import java.util.function.Supplier;

/**
 * @author kvasim
 *
 */
public interface DefaulableFactory {
	static DefaultMethodInterface create(Supplier<DefaultMethodInterface> supplier){
		return supplier.get();
	}
}
