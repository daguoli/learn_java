//http://www.runoob.com/java/java-object-classes.html

import java.io.*;

public class EmployeeTest {
	public static void main(String []args) {
		Employee EmpOne = new Employee("Timmy");
		Employee EmpTwo = new Employee("Jim");
		
		EmpOne.empAge(30);
		EmpOne.empDesignation("��Ʒ����");
		EmpOne.empSalary(3000);
		EmpOne.printEmployee();
		System.out.println();  
	
		EmpTwo.empAge(35);
		EmpTwo.empDesignation("�߼���Ʒ����");
		EmpTwo.empSalary(5000);
		EmpTwo.printEmployee();
		System.out.println();  
	}
}