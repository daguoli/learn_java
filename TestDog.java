class Animals{
	//�Զ��������ľ���ʵ��
	public void move(){
		System.out.println("��������ƶ�");
	}
}

//��д������Ը����������ʵķ�����ʵ�ֹ��̽������±�д, ����ֵ���βζ����ܸı䡣����ǲ��䣬������д��
class Dog extends Animals{
	public void move(){
		super.move(); // Ӧ��super��ķ���
		System.out.println("�������ܺ���");
	}
}
 
public class TestDog{
	public static void main(String args[]){
		Animals a = new Animals(); // Animal ����
		Animals b = new Dog(); // Dog ����

		a.move();// ִ�� Animal ��ķ���
		b.move();//ִ�� Dog ��ķ���
	}
}