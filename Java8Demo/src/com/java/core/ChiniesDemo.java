package com.java.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class ChiniesDemo {
	public static void main(String[] args) throws Exception {
		
		 try {
				File fileDir = new File("test.txt");
					
				Writer out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(fileDir), "UTF8"));

				out.append("Website, UTF-8,").append("\r\n");
				out.append("传/傳 has, readings,").append("\r\n");
				out.append("传/傳 has, readings, UTF-8").append("\r\n");
				
				out.flush();
				out.close();
			        
			    } 
			   catch (UnsupportedEncodingException e) 
			   {
				System.out.println(e.getMessage());
			   } 
			   catch (IOException e) 
			   {
				System.out.println(e.getMessage());
			    }
			   catch (Exception e)
			   {
				System.out.println(e.getMessage());
			   } 
			}	

}
