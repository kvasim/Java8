package com.java.core;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		ExceptionHandling exp = new ExceptionHandling();
		// ExceptionHandling exp= null;
		// try{
		System.out.println(exp.divide(10, 5));
		// }catch (Exception e) {
		// System.out.println(" This is main catch block "+e.getMessage());
		// }

		System.out.println(" End of code");
	}

	// 10,0
	public int divide(int num1, int num2) throws Exception {
		int result = 0;
		try {
			if (num1 == 1) {
				return 1;
			}
			if (num2 == 0) {
				throw new Exception(" This is wrong input");
			}

			result = num1 / num2;
			// Return statement
			//return result;

		} catch (ArithmeticException e) {
			System.out.println(" This is catch block");
			// e.printStackTrace();
			throw e;
			// throw new Exception(e);
		} catch (NullPointerException nullExp) {
			System.out.println(" This null pointer exception  " + nullExp.getMessage());
		} catch (ExceptionDemo exp) {
			System.out.println(" This is exception block");
			exp.printStackTrace();
		}finally{
			System.out.println(" This is finaly block ");
			//close connection
			//close file
		}

		System.out.println(" Finished Divide");

		return result;

	}
}
