package com.java.core.collection.map;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PreparePropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();  
		p.setProperty("name","Wasim Khan");  
		p.setProperty("email","wasimkhan03@gmail.com");  
		  
		p.store(new FileWriter("info.properties"),"Java Properties Example");  
		  
	}

}
