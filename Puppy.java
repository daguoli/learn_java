//http://www.runoob.com/java/java-object-classes.html

public class Puppy {
	int puppyAge;
	String puppyColor ;
	
	//Puppy��Ĺ��������ù�����ֻ��һ��������name
	public Puppy(String name){
		System.out.println("С���������ǣ�" + name );
	}
	
	//��������������
	public void setAge( int age ){
		puppyAge = age;
	}
	public int getAge( ){
		System.out.println("С���������ǣ�" + puppyAge );
		return puppyAge;
	}

	//������������ɫ
	public void setColor( String color ){
		puppyColor = color;
	}
	public String getColor( ){
		System.out.println("С������ɫ�ǣ�" + puppyColor );
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