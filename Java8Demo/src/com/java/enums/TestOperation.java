package com.java.enums;

public class TestOperation {

	public static void main(String[] args) {

        double result = Operation.PLUS.calculate(1, 2);
        System.out.println(result); //3.0
        
        result = Operation.MINUS.calculate(1, 2);
        System.out.println(result); //3.0
        
        result = Operation.TIMES.calculate(3, 2);
        System.out.println(result); //3.0
        
        // Convert String to enum
        /////enum valueOf + uppercase
        Operation op = Operation.valueOf("times".toUpperCase());
        System.out.println(op.calculate(10, 3));

    }
}
