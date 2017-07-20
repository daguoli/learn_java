package objectoriented;
class Animal{
	private String name;
	private int id;
	
	public Animal(String myName, int myid){
		name = myName;
		id = myid;
	}
	public void eat(){
		System.out.println(name + "正在吃");  
	}
	public void sleep(){
		System.out.println(name + "正在睡");  
	}
	public void introduction(){
		System.out.println("大家好！我是" + id + "号" + name + ".");  
	}
}

public class Dog extends Animal{
	public void eat(){
	   System.out.println(name + "正在吃骨头");
	}
}

public class TestDog{
	public static void main(String args[]){
		Animal a = new Animal("Tom",1); // Animal 对象
		Animal b = new Dog("Jerry",2); // Dog 对象
	
		a.eat();// 执行 Animal 类的方法
		b.eat();//执行 Dog 类的方法
	}
}

	