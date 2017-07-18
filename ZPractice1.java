// 题目：有四个数字：1、2、3、4，能组成多少个互不相同且无重复数字的三位数？各是多少？

public class ZPractice1 {
	public static void main(String []args) {
		int[] myList = { 1, 2, 3, 4 };
		
		for ( int i = 0; i < myList.length; i++ ){
			for ( int j = 0; j < myList.length; j++ ){
				for ( int k = 0; k < myList.length; k++ ){
					if ((myList[i] != myList[j] ) && (myList[i] != myList[k] ) && (myList[j] != myList[k] )){
						System.out.println( "符合条件的三位数：" + myList[i] + myList[j] + myList[k] );
					}
				}
			}
		}
	}
}