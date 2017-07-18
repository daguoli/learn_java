//将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。

import java.util.Scanner;
import java.util.ArrayList;

public class ZPractice14 {
	public static void main(String []args) {
		ArrayList list = new ArrayList();
		
		//从屏幕输入待分解质因数的数字
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter num :"); 
		int num = input.nextInt();
		
		//分解质因数
		while (num > 1){
			for (int i = 2; i <= num; i++){
				if (num%i == 0){
					System.out.println("因数:" + i ); 
					num = num/i; 
					
					//将质因数存入数组中
					list.add(i);
					
					break;
				}
			}
		}
		System.out.println( "质因数为:" + list);
	}
}