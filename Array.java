//http://www.runoob.com/java/java-array.html


public class Array {
	public static void main(String []args) {
		double[] myList = { 1.1, 1.3, 1.44, 2.58 };
		
		//��ӡ��������Ԫ��
		for ( int i = 0; i < myList.length; i++ ){
			System.out.println( myList[i] );
		}

		//����Ԫ���ܺ�
		double sum = 0 ;
		for ( int i = 0; i < myList.length; i++ ){
			sum = sum + myList[i];
		}
		System.out.println("sum is:" + sum );
		
		//�������ֵ
		double max = myList[0];
		for ( int i = 0; i < myList.length; i++ ){
			if (myList[i] > max){
				max = myList[i];
			}
		}
		System.out.println("max num is:" + max );
	}
}