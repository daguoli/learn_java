//http://www.runoob.com/java/java-methods.html
//�����������ʾ����ζ���һ���������Լ���ε�������

public class DefinitionMethod {
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
	
	//void���ͷ�������������ֵ
	public static void printGrade (double score ) {
		String level;
		if ( score >= 90.0 ){
			level = "A";
		}
		else if ( score >= 75.0 ){
			level = "B";
		}
		else if ( score >= 60.0 ){
			level = "C";
		}
		else{
			level = "D";
		}
		System.out.println(level);
	}
	
	public static void main(String []args) {
		//���ñȽϴ�С�ķ���
		int k = max(5, 8);
		System.out.println( "5 �� 8 �Ƚϣ����ֵ�ǣ�" + k);
		
		//���ô�ӡ�ɼ��ȼ��ķ���
		printGrade(78.5);
	}
}