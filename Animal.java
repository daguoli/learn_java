//����һ��Animal����

public class Animal { 
    private String name;  
    private int id; 
    
    public Animal(String myName, int myid) { 
    	//��ʼ������ֵ
        name = myName; 
        id = myid;
    } 
    
    public void eat(){ 
    	//�Զ��������ľ���ʵ��
        System.out.println(name+"���ڳ�"); 
    }
    
    public void sleep(){
    	//˯�������ľ���ʵ��
        System.out.println(name+"����˯");
    }
    
    public void introduction() { 
    	//���ҽ��ܷ����ľ���ʵ��
        System.out.println("��Һã�����" + id + "��" + name + "."); 
    } 
}