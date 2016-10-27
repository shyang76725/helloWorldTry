package com.quanta.qci;

public class thisIsHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisIsHelloWorld _thisHelloWorld = new thisIsHelloWorld();
		System.out.println(_thisHelloWorld.Hello1());
		System.out.println(_thisHelloWorld.HelloName());
		System.out.println(_thisHelloWorld.HelloName("Penny"));
	}
	/**
	 * This is simple HelloWorld
	 * @return
	 */
	public String Hello1(){
		return "Hello World";
	}
	/**
	 * This is simple HelloWorld with Shyang
	 * @return
	 */
	public String HelloName(){
		return "Hello World Shyang";
	}
	/**
	 * This is simple HelloWorld with user input.
	 * @param name user input
	 * @return
	 */
	public String HelloName(String name){
		return "Hello World "+name;
	}
	/**
	 * This is simple HelloWorld with user input II.
	 * @param name user input
	 * @return
	 */
	public String HelloName(String name, int old){
		return "Hello World "+name+", and you are "+old+" years old.";
	}
}
