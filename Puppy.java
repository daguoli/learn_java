//http://www.runoob.com/java/java-object-classes.html

public class Puppy {
	int puppyAge;
	String puppyColor ;
	
	//Puppy类的构造器，该构造器只有一个参数：name
	public Puppy(String name){
		System.out.println("小狗的名字是：" + name );
	}
	
	//方法：设置年龄
	public void setAge( int age ){
		puppyAge = age;
	}
	public int getAge( ){
		System.out.println("小狗的年龄是：" + puppyAge );
		return puppyAge;
	}

	//方法：设置颜色
	public void setColor( String color ){
		puppyColor = color;
	}
	public String getColor( ){
		System.out.println("小狗的颜色是：" + puppyColor );
		return puppyColor;
	}
	
	//main
	public static void main(String []args) {
		Puppy myPuppy = new Puppy("Tommy");
		
		myPuppy.setAge(2);
		myPuppy.getAge();
		
		myPuppy.setColor("black");
		myPuppy.getColor();
	}
}