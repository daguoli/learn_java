//输入三个整数x,y,z，请把这三个数由小到大输出。

import java.util.Scanner;

public class ZPractice5 {

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

	public static void main(String []args) {
		//获取屏幕输入的x,y,z
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter num x :"); 
		int x = input.nextInt();
		System.out.print("Please enter num y :"); 
		int y = input.nextInt();
		System.out.print("Please enter num z :"); 
		int z = input.nextInt();
		
		//比较三个数字的大小
		int k = max(x,y);
		int j = max(x,z);
		int maxnum = max (k ,j);
		System.out.println("max num is:" + maxnum); 
		
	}
}