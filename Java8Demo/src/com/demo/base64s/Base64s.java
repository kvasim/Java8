/**
 * 
 */
package com.demo.base64s;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author kvasim
 *
 */
public class Base64s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String text = " الأسئلة أو التعليقات باستخدام النموذج التالي. وبدلاً من ذلك، يمكنك مباشرة";

		final String encoded = Base64.getEncoder()

		.encodeToString(text.getBytes(StandardCharsets.UTF_8));

		System.out.println(encoded);

		final String decoded = new String(

		Base64.getDecoder().decode(encoded),

		StandardCharsets.UTF_8);

		System.out.println(decoded);

	}

}
