package com.quanta.qci;

public class thisIsHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisIsHelloWorld _thisHelloWorld = new thisIsHelloWorld();
		System.out.println(_thisHelloWorld.Hello1());
		System.out.println(_thisHelloWorld.HelloName());
		System.out.println(_thisHelloWorld.HelloName("Penny"));
	}
	public String Hello1(){
		return "Hello World";
	}
	public String HelloName(){
		return "Hello World Shyang";
	}
	public String HelloName(String name){
		return "Hello World "+name;
	}
	
}
