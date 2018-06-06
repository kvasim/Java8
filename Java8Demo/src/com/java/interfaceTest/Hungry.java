/**
 * 
 */
package com.java.interfaceTest;

/**
 * @author KVASIM
 *
 */
public interface Hungry<E> {
	void much(E x);
}

interface Herbivore<E extends Plant> extends Hungry<E>{}
abstract class Plant{}
