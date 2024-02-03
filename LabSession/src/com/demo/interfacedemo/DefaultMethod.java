package com.demo.interfacedemo;

//Task1>> 
//Create an example to show the usage of default, static and private method in interface
interface Person{
	void details();
	default void student() {
		Info();
		System.out.println("Hello i am a student");
	}
		static void Details() {
			System.out.println("Hello You are in Static Method");
		}
private static void Info() {
	System.out.println("I am an private Static method");
}
	}

class Employee implements Person{

	@Override
	public void details() {
		System.out.println("Hello i am an Employee");
		
	}
	
}
class Student implements Person{

	@Override
	public void details() {
		System.out.println("You are in student block ");
		
	}
	public void student() {
		System.out.println("Hello I am a Student  ");
	}
	
}
public class DefaultMethod {

	public static void main(String[] args) {
		Person.Details();
		Person p;
		p=new Employee();
		p.details();
		p=new Student();
		p.details();
		p.student();
	

	}

}
