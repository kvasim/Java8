package com.java8.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class ReadFile {
	
	public static String fileName="src/db.properties";
	
	public static void main(String[] args) throws IOException {
		
		readFile();
	}

	private static void readFile() throws IOException {

/*		Stream<String> strStream= Files.lines(Paths.get(fileName));
		strStream.forEach(c->System.out.println(c));
*/
		List<String> fileList= Files.readAllLines(Paths.get(fileName));
		fileList.forEach(System.out::println);
		writeNewFile(fileList);
	}


private static void writeNewFile(List<String> fileList) {
		fileList.forEach(c->{
			try {
				Files.write(Paths.get("src/newFile.txt"), c.getBytes(), StandardOpenOption.CREATE);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		System.out.println(" File Created ");
	}

public static void readFileMethod() throws Exception {
	String fileName="abc";
	
	List<String> fileContent= Files.readAllLines(Paths.get(fileName));
	fileContent.forEach(System.out::println);
	
}
}