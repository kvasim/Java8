package com.java.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JavaSerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee=new Employee(11,"Wasim","Ford");
		//serializeEmployeeObject(employee);
		Employee emp = deSerializeEmployeeObject();
		System.out.println(emp.getEmpName());
		//System.out.println(" emp  "+emp.getMobileNumber());
	}

	private static Employee deSerializeEmployeeObject() throws IOException, ClassNotFoundException {

		FileInputStream fileInput= new FileInputStream("emp.ser");
		ObjectInputStream objReader= new ObjectInputStream(fileInput);
		Employee emp=(Employee) objReader.readObject();
		return emp;
	}

	private static void serializeEmployeeObject(final Employee employee) throws IOException {
		FileOutputStream fileOut= new FileOutputStream("emp.ser");
		ObjectOutputStream objWriter=new ObjectOutputStream(fileOut);
		objWriter.writeObject(employee);
		objWriter.close();
		System.out.println(" Serialization Completed ");
	}

}
