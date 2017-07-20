class Animals{
	//吃东西方法的具体实现
	public void move(){
		System.out.println("动物可以移动");
	}
}

//重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。即外壳不变，核心重写！
class Dog extends Animals{
	public void move(){
		super.move(); // 应用super类的方法
		System.out.println("狗可以跑和走");
	}
}
 
public class TestDog{
	public static void main(String args[]){
		Animals a = new Animals(); // Animal 对象
		Animals b = new Dog(); // Dog 对象

		a.move();// 执行 Animal 类的方法
		b.move();//执行 Dog 类的方法
	}
}