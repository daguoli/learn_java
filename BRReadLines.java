//http://www.runoob.com/java/java-files-io.html
//使用 BufferedReader 的 readLine() 方法,从标准输入读取一个字符串需要

import java.io.*;

public class BRReadLines {
	public static void main(String args[]) throws IOException {
		String str;
		
		// 使用 System.in 创建 BufferedReader 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Enter lines of text.");
	    System.out.println("Enter 'end' to quit.");
	    
	    // 使用readLine() 方法
	    do {
	       str = br.readLine();
	       System.out.println(str);
	    } while(!str.equals("end"));
	}
}