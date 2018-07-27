package com.java.core.collection.list;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetExample {

	public static void main(String[] args) {
		// Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
		Set<days> set1 = EnumSet.allOf(days.class);
		// Set<days> set1 = EnumSet.noneOf(days.class);
		// Traversing elements
		Iterator<days> iter = set1.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}

}
