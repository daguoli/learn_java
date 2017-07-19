//重载就是同样的一个方法能够根据输入数据的不同，做出不同的处理
//重写就是当子类继承自父类的相同方法，输入数据一样，但要做出有别于父类的响应时，你就要覆盖父类方法

public class Overloading {
    public int test(){
        System.out.println("test1");
        return 1;
    }
 
    public void test(int a){
        System.out.println("test2");
    }   
 
    //以下两个参数类型顺序不同
    public String test(int a,String s){
        System.out.println("test3");
        return "returntest3";
    }   
 
    public String test(String s,int a){
        System.out.println("test4");
        return "returntest4";
    }   
 
    public static void main(String[] args){
        Overloading o = new Overloading();
        
        System.out.println(o.test());
        System.out.println();
        
        o.test(1);
        System.out.println();
        
        System.out.println(o.test(1,"test3"));
        System.out.println();
        
        System.out.println(o.test("test4",1));
        System.out.println();
    }
}