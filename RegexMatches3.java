//http://www.runoob.com/java/java-regular-expressions.html
/*
 * ����matches �� lookingAt ����:
 * matches �� lookingAt ��������������ƥ��һ����������ģʽ��
 * ��ͬ�� matcher Ҫ���������ж�ƥ�䣬��lookingAt ��Ҫ��
 * lookingAt ������Ȼ����Ҫ���䶼ƥ�䣬������Ҫ�ӵ�һ���ַ���ʼƥ�䡣
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches3 {
    
    private static final String line1 = "fooooooooooooooooo";
    private static final String line2 = "ooooofoooooooooooo";
    private static final String REGEX = "foo";
    private static Pattern pattern;
    private static Matcher matcher;
    private static Matcher matcher2;
    
	public static void main(String args[]) {
	       pattern = Pattern.compile(REGEX);
	       matcher = pattern.matcher(line1);
	       matcher2 = pattern.matcher(line2);
	 
	       System.out.println("Current INPUT is: " + line1);
	       System.out.println("Current INPUT2 is: " + line2);
	       System.out.println("Current REGEX is: " + REGEX);
	 
	       System.out.println("lookingAt(): "+matcher.lookingAt());
	       System.out.println("matches(): "+matcher.matches());
	       System.out.println("lookingAt(): "+matcher2.lookingAt());
	}
}
		