//http://www.runoob.com/java/java-regular-expressions.html
//������һ���Ե��� "cat" �����������ַ����г��ִ������м��������ӣ�

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches2 {
	public static void main(String args[]) {
		
		// ��ָ��ģʽ���ַ�������
		String line = "cat cat cat cattie cat";
		String pattern = "\\bcat\\b";
		
		// ���� Pattern ����
		Pattern r = Pattern.compile(pattern);

		//���� matcher ����
		Matcher m = r.matcher(line);	
		int count = 0;
		
		while (m.find( )) {
			count++ ;
			System.out.println("Match number "+ count);
			System.out.println("start(): "+ m.start());
			System.out.println("end(): "+ m.end());
			System.out.println();
		}
	}
}