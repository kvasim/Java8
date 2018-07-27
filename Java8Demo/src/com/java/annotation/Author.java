package com.java.annotation;

import com.java.annotation.Author.Name;

public @interface Author {

	 @interface Name{
		String first();
		String last();
	}

	Name value();


}
