//http://www.runoob.com/java/java-object-classes.html

import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	//��Ĺ�����
	public Employee(String name,int age,String designation,double salary){
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
	}
	
	/*
	   // ����age��ֵ
	   public void empAge(int empAge){
	      age =  empAge;
	   }
	   // ����designation��ֵ
	   public void empDesignation(String empDesig){
	      designation = empDesig;
	   }
	   // ����salary��ֵ
	   public void empSalary(double empSalary){
	      salary = empSalary;
	   }
	 */
	
	//��ӡ��Ϣ
	public void printEmployee(){
		System.out.println("����:" + name );
		System.out.println("����:" + age );
		System.out.println("ְλ:" + designation );
		System.out.println("нˮ:" + salary);
	}
}

