//定义一个Animal父类

public class Animal { 
    private String name;  
    private int id; 
    
    public Animal(String myName, int myid) { 
    	//初始化属性值
        name = myName; 
        id = myid;
    } 
    
    public void eat(){ 
    	//吃东西方法的具体实现
        System.out.println(name+"正在吃"); 
    }
    
    public void sleep(){
    	//睡觉方法的具体实现
        System.out.println(name+"正在睡");
    }
    
    public void introduction() { 
    	//自我介绍方法的具体实现
        System.out.println("大家好！我是" + id + "号" + name + "."); 
    } 
}