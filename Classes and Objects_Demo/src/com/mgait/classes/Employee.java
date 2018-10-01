package com.mgait.classes;

public class Employee {
	private static int empCounter = 100;
	private int empId = 100;
	//initialization block
	{		
		++empCounter;
		System.out.println("initialization block executed");
	}
	//static block
	static{
		++empCounter;
		System.out.println("static block executed");
	}
	//Constructor
	public Employee(){
		System.out.println("Constructor executed");
		empId = ++empCounter;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println("emp id :" + e1.empId);
		System.out.println(e1.empCounter);
	}
}
