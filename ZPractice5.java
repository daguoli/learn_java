//������������x,y,z���������������С���������

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
		//��ȡ��Ļ�����x,y,z
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter num x :"); 
		int x = input.nextInt();
		System.out.print("Please enter num y :"); 
		int y = input.nextInt();
		System.out.print("Please enter num z :"); 
		int z = input.nextInt();
		
		//�Ƚ��������ֵĴ�С
		int k = max(x,y);
		int j = max(x,z);
		int maxnum = max (k ,j);
		System.out.println("max num is:" + maxnum); 
		
	}

	
}