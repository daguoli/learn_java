//http://www.runoob.com/java/java-files-io.html
//使用 BufferedReader 在控制台读取字符

import java.io.*;

public class BRRead {
	public static void main(String args[]) throws IOException {
		char c;
		
		// 使用 System.in 创建 BufferedReader 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�����ַ�, ���� 'q' ���˳���");
		
	    // 读取字符
		// 每次调用 read() 方法，它从输入流读取一个字符并把该字符作为整数值返回。 当流结束的时候返回 -1。该方法抛出 IOException。
		do {
	       c = (char) br.read();
	       System.out.println(c);
	    } while(c != 'q');
	}
}