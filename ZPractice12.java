//��Ŀ���ж�101-200֮���ж��ٸ����������������������
//�ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ����������������������������֮�������� ��

public class ZPractice12 {
	public static void main(String []args) {
	    int count = 0; 
		
	    //i����Ҫ�ж��ǲ���������num��k�ǳ���
		for ( int i = 101; i <= 200; i++ ){
			int flag = 0; //Ĭ��iΪ����
			for (int k = 2; k < i; k++){
				if (i%k == 0){
					flag = 1;
					break;
				}
			}
			if (flag == 0){
				System.out.println(i + " ������" );
			    count = count + 1 ;
			}
		}
		System.out.println("101-200֮��һ���������� " + count + " ��" );
	}
}