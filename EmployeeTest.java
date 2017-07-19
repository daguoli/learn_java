//http://www.runoob.com/java/java-object-classes.html

import java.io.*;

public class EmployeeTest {
	public static void main(String []args) {
		Employee EmpOne = new Employee("Timmy",30,"产品经理",3000);
		Employee EmpTwo = new Employee("Jim",35,"高级产品经理",5000);
		EmpOne.printEmployee();
		EmpTwo.printEmployee();
		
		/*
		EmpOne.empAge(30);
		EmpOne.empDesignation("产品经理");
		EmpOne.empSalary(3000);
		EmpOne.printEmployee();
		System.out.println();  
	
		EmpTwo.empAge(35);
		EmpTwo.empDesignation("高级产品经理");
		EmpTwo.empSalary(5000);
		EmpTwo.printEmployee();
		System.out.println();  
		 */

	}
}