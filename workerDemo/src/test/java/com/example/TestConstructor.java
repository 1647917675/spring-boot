package com.example;

abstract class TestConstructor {

	private String name;
	
	private int age;
	
	public TestConstructor(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public static void main(String[] args) {
		new Test("tomcat",4);
	}
}


class Test extends TestConstructor{

	public Test(String name, int age) {
		super(name, age);
		System.out.println(this.getName());
	}
	
}