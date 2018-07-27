package com.java.core.collection.custom.linkedmap;

public class LinkedHashMapCustom<K, V> {

	private Entry<K,V>[] table;
	private int capacity=4;
	private Entry<K,V> header;
	private Entry<K,V> last;
	
	
	static class Entry<K,V>{
		K key;
		V value;
		Entry<K,V> next;
		Entry<K,V> before,after;
		 public Entry(K key, V value, Entry<K,V> next){
             this.key = key;
             this.value = value;
             this.next = next;
         }
		
	}
	 @SuppressWarnings("unchecked")
	    public LinkedHashMapCustom(){
	       table = new Entry[capacity];
	    }
	 
	 public void put(K newKey, V data){
	       if(newKey==null)
	           return;    //does not allow to store null.
	       
	       
	      Entry<K, V> newEntry= new Entry<K, V>(newKey, data, null);
	      
	      this.maintainOrderAfterInsert(newEntry);
	       
	 }

	private void maintainOrderAfterInsert(Entry<K, V> newEntry) {

		if(this.header==null) {
			this.header=newEntry;
			this.last=newEntry;
			return;
		}
		if(this.header.key.equals(newEntry.key)) {
			this.deleteFirst();
			//this.insertFirst(newEntry);
			return;
		}
	}

	private void deleteFirst() {
		// TODO Auto-generated method stub
		
	}
	
}
