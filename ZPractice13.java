//��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ���������
//���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���


public class ZPractice13 {
	public static void main(String []args) {
		for (int i = 100; i < 1000; i++){
			int a = i/100;
			int b = (i - a*100 )/10;
			int c = i - a*100 -b*10;
			if ( i == a*a*a + b*b*b +c*c*c ){
				System.out.println(i + " ��ˮ�ɻ���" );
			}
		}
		
	}
}