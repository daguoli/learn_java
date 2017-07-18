//http://www.runoob.com/java/java-regular-expressions.html
/*
 * 解释matches 和 lookingAt 方法:
 * matches 和 lookingAt 方法都用来尝试匹配一个输入序列模式。
 * 不同是 matcher 要求整个序列都匹配，而lookingAt 不要求。
 * lookingAt 方法虽然不需要整句都匹配，但是需要从第一个字符开始匹配。
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
		