package com.mt.sample;

/**
 * Hello world!
 *
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello!! This is a Maven build tool on the date " + getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		String m = "NeoSora Technologies"; 
		return new Date();

	}

}
