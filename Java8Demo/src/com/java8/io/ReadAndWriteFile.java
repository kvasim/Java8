package com.java8.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

	public static void main(String[] args) throws IOException {

		/*Files.lines(new File("C:\\Users\\kvasim\\Desktop\\ftpDetails.txt").toPath())
	    .map(s -> s.trim())
	 .filter(s -> !s.isEmpty())
	 .forEach(System.out::println);
		*/
		//
		String fileName="C:\\\\Users\\\\kvasim\\\\Desktop\\\\ftpDetails.txt";
		String fileName2="C:\\\\Users\\\\kvasim\\\\Desktop\\\\temp.txt";
		List<String> fileList=new ArrayList<>();
		//Files.lines(new File("C:\\Users\\kvasim\\Desktop\\ftpDetails.txt").toPath(),StandardCharsets.UTF_8).forEach(l->fileList.add(l));
		List<String> lines = Files.readAllLines(Paths.get(fileName));
	System.out.println(lines);
	
	lines.forEach(c->{
		try {
			Files.write(Paths.get(fileName2), c.getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});
	Files.write(Paths.get(fileName), lines, StandardOpenOption.CREATE);
		//Files.list(Paths.get(".")).forEach(p->fileList.add(p.getFileName().toAbsolutePath().toString()));
		//System.out.println(fileList);
	}

}
