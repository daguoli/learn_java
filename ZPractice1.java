// ��Ŀ�����ĸ����֣�1��2��3��4������ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�

public class ZPractice1 {
	public static void main(String []args) {
		int[] myList = { 1, 2, 3, 4 };
		
		for ( int i = 0; i < myList.length; i++ ){
			for ( int j = 0; j < myList.length; j++ ){
				for ( int k = 0; k < myList.length; k++ ){
					if ((myList[i] != myList[j] ) && (myList[i] != myList[k] ) && (myList[j] != myList[k] )){
						System.out.println( "������������λ����" + myList[i] + myList[j] + myList[k] );
					}
				}
			}
		}
	}
}