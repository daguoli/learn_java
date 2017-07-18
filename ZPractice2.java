/* 题目：企业发放的奖金根据利润提成。
 * 	利润(I)低于或等于10万元时，奖金可提10%；
 * 	利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
 * 	20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
 * 	60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成;
 * 	从键盘输入当月利润I，求应发放奖金总数？
*/

import java.util.Scanner;

public class ZPractice2 {
	public static void main(String []args) {
		
		//获取屏幕输入的利润值
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter profit value:"); 
		double x = input.nextInt();
	    
		//计算奖金
		double bonus = x;
		if (x <= 100000){
			bonus = x * 0.1; 
		}
		else if ( 100000 < x && x <= 200000 ){
			bonus = 10000 + ( x - 100000 ) * 0.075;
		}
		else if ( 200000 < x && x <= 400000 ){
			bonus = 10000 + 7500 + ( x - 200000 ) * 0.05;
		}
		else if ( 400000 < x && x <= 600000 ){
			bonus = 10000 + 7500 + 10000 + ( x - 400000 ) * 0.03;
		}
		else if ( 600000 < x && ( x <= 1000000) ){
			bonus = 10000 + 7500 + 10000 + 6000 + ( x - 600000 ) * 0.015;	
		}
		else {
			bonus = 10000 + 7500 + 10000 + 6000 + 6000 + ( x - 1000000 ) * 0.01;
		}
		System.out.println("奖金是:" + bonus + "元"); 
	}
}