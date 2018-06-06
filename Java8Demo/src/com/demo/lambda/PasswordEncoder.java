package com.demo.lambda;
@FunctionalInterface
public interface PasswordEncoder {
	public String encode(String password, String salt);
}

