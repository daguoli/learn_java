//http://www.runoob.com/java/java-files-io.html
//ʹ�� BufferedReader �ڿ���̨��ȡ�ַ�

import java.io.*;

public class BRRead {
	public static void main(String args[]) throws IOException {
		char c;
		
		// ʹ�� System.in ���� BufferedReader 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�����ַ�, ���� 'q' ���˳���");
		
	    // ��ȡ�ַ�
		// ÿ�ε��� read() ������������������ȡһ���ַ����Ѹ��ַ���Ϊ����ֵ���ء� ����������ʱ�򷵻� -1���÷����׳� IOException��
	    do {
	       c = (char) br.read();
	       System.out.println(c);
	    } while(c != 'q');
	}
}