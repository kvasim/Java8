/**
 * 
 */
package com.java.interview;

/**
 * @author KVASIM
 *
 */
public class FirstNonRepChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="outputo";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(i==0){
				String str2=str.substring(i+1);
				System.out.println("str2--:"+str2);
				if(!str2.contains(String.valueOf(ch))){
					System.out.println("Ansewere is: "+ch);
					break;
				}
			}else{
				String subStr=getSubString(str, i);
				System.out.println("SubStr--:"+subStr);
				if(!subStr.contains(String.valueOf(ch))){
					System.out.println("Ansewere is: "+ch);
					break;
				}
			}
		}
	}

	public static String getSubString(String str, int index){
		String value=new StringBuilder().append(str.substring(0,index)).append(str.substring(index+1)).toString();
		return value;
	}
}
