//题目：判断101-200之间有多少个素数，并输出所有素数。
//判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。 　

public class ZPractice12 {
	public static void main(String []args) {
	    int count = 0; 
		
	    //i是需要判断是不是素数的num，k是除数
		for ( int i = 101; i <= 200; i++ ){
			int flag = 0; //默认i为素数
			for (int k = 2; k < i; k++){
				if (i%k == 0){
					flag = 1;
					break;
				}
			}
			if (flag == 0){
				System.out.println(i + " 是素数" );
			    count = count + 1 ;
			}
		}
		System.out.println("101-200之间一共有素数： " + count + " 个" );
	}
}