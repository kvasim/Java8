package com.java.core.encoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class EncodingExample {
	private static final String DEALER_NAME_CH = "中太汽車522";
	 private static final String encoding = "GB18030";
	// private static final String encoding = "UTF8";

	public static void main(String[] args) {

		readAndWriteChinesContent();
	}

	private static void readAndWriteChinesContent() {

		try {
			File fileDir = new File("test1.csv");
			BufferedWriter write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir),encoding));
			//FileWriter fw = new FileWriter(fileDir);
			//BufferedWriter write= new BufferedWriter(fw);
			write.write("This is, dummy value,");
			write.write("\"\"\""+DEALER_NAME_CH+"\"\"\"");
			write.write("This is ,end value");
			write.flush();
			write.close();

			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"));

			String str;

			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}

			in.close();
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
