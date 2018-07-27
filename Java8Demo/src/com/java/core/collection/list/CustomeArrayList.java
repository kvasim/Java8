package com.java.core.collection.list;

import java.util.Arrays;

public class CustomeArrayList<E> implements CustomeList<E> {
	Object[] elementData;
	private final static int DEFAULT_CAPACITY=5;
	private int size=0;
	public CustomeArrayList() {
		elementData= new Object[DEFAULT_CAPACITY];
	}
	public CustomeArrayList(int initialCapacity) {
		elementData= new Object[initialCapacity];
	}
	@Override
	public boolean add(E e) {
		ensureCapacityInternal(size + 1);
		elementData[size++]=e;		
		return true;
	}

	private void ensureCapacityInternal(int nextSize) {
		if(nextSize>=elementData.length) {
			elementData=Arrays.copyOf(elementData, elementData.length+(DEFAULT_CAPACITY/2));
		}
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		rangeCheck(index);
		
		return (E) elementData[index];
	}
	private void rangeCheck(int index) {
		if(index <0 || (index>(size-1))) {
			throw  new IndexOutOfBoundsException(" Get index is out of array "+index);
		}
	}

	@Override
	public int size() {
		return size;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomeArrayList [elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) + "]";
	}
	@Override
	public E remove(int index) {
		rangeCheck(index);
		 @SuppressWarnings("unchecked")
		E oldValue = (E) elementData[index];

	        int numMoved = size - index - 1;
	        if (numMoved > 0)
	            System.arraycopy(elementData, index+1, elementData, index,
	                             numMoved);
	        elementData[--size] = null; // clear to let GC do its work

	        return oldValue;
	}

}
