//http://www.runoob.com/java/java-methods.html
//下面的例子演示了如何定义一个方法，以及如何调用它：

public class DefinitionMethod {
	public static int max (int num1 ,int num2) {
		int result;
		if (num1 > num2){
			result = num1;
		}
		else{
			result = num2;
		}
		return result;
	}
	
	//void类型方法，它不返回值
	public static void printGrade (double score ) {
		String level;
		if ( score >= 90.0 ){
			level = "A";
		}
		else if ( score >= 75.0 ){
			level = "B";
		}
		else if ( score >= 60.0 ){
			level = "C";
		}
		else{
			level = "D";
		}
		System.out.println(level);
	}
	
	public static void main(String []args) {
		//调用比较大小的方法
		int k = max(5, 8);
		System.out.println( "5 和 8 比较，最大值是：" + k);
		
		//调用打印成绩等级的方法
		printGrade(78.5);
	}
}