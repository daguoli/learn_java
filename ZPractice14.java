//��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��

import java.util.Scanner;
import java.util.ArrayList;

public class ZPractice14 {
	public static void main(String []args) {
		ArrayList list = new ArrayList();
		
		//����Ļ������ֽ�������������
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter num :"); 
		int num = input.nextInt();
		
		//�ֽ�������
		while (num > 1){
			for (int i = 2; i <= num; i++){
				if (num%i == 0){
					System.out.println("����:" + i ); 
					num = num/i; 
					
					//������������������
					list.add(i);
					
					break;
				}
			}
		}
		System.out.println( "������Ϊ:" + list);
	}
}