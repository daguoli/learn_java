//http://www.runoob.com/java/java-files-io.html
//ʹ�� BufferedReader �� readLine() ����,�ӱ�׼�����ȡһ���ַ�����Ҫ

import java.io.*;

public class BRReadLines {
	public static void main(String args[]) throws IOException {
		String str;
		
		// ʹ�� System.in ���� BufferedReader 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Enter lines of text.");
	    System.out.println("Enter 'end' to quit.");
	    
	    // ʹ��readLine() ����
	    do {
	       str = br.readLine();
	       System.out.println(str);
	    } while(!str.equals("end"));
	}
}