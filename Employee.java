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
	 * 用构造方法和用set/get的区别：
	 * 用构造方法new出来的对象，只有在构造的时候会调用一次，后面就没有用了；
	 * 但是set方法，可以在任何需要的时候，进行调用。子类里可以覆盖父类里的同名方法。
	 * 一般我们设计类的时候，每个属性，都附带一个set 和 get方法===。这个set和get可以对构造方法中的属性进行重新覆盖定义；
	 * 
	 * 构造方法还有一个用途：将属性的必填性进行约束。比如你的employee 名字不能为空，那你就定义一个构造方法，必须传入name，避免了出现一个没有名字的 employee
	 */
	
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