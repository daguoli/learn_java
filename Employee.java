//http://www.runoob.com/java/java-object-classes.html

import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	//类的构造器
	public Employee(String name,int age,String designation,double salary){
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
	}
	
	/*
	   // 设置age的值
	   public void empAge(int empAge){
	      age =  empAge;
	   }
	   // 设置designation的值
	   public void empDesignation(String empDesig){
	      designation = empDesig;
	   }
	   // 设置salary的值
	   public void empSalary(double empSalary){
	      salary = empSalary;
	   }
	 */
	
	//打印信息
	public void printEmployee(){
		System.out.println("名字:" + name );
		System.out.println("年龄:" + age );
		System.out.println("职位:" + designation );
		System.out.println("薪水:" + salary);
	}
}

