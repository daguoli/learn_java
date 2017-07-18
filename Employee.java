//http://www.runoob.com/java/java-object-classes.html

import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	//类的构造器
	public Employee(String name){
		this.name = name;
	}
	//方法：设置age
	public void empAge (int empAge){
		age = empAge;
	}
	//方法：设置designation
	public void empDesignation (String empDesignation){
		designation = empDesignation;
	}
	//方法：设置salary
	public void empSalary (double empSalary){
		salary = empSalary;
	}
	
	//打印信息
	public void printEmployee(){
		System.out.println("名字:" + name );
		System.out.println("年龄:" + age );
		System.out.println("职位:" + designation );
		System.out.println("薪水:" + salary);
	}
}

