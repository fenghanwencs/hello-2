package com.wl.hello;

/**
 * 
 * @author wl
 *
 */
public class APP {

	public static void main(String[] args) {
		
		sayHello("github");
		
		sayHello("fork");
	}

	private static void sayHello(String msg) {
		System.out.println("Hello " + msg);
	}

}
