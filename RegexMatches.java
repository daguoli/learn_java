//http://www.runoob.com/java/java-regular-expressions.html
//下面的例子说明如何从一个给定的字符串中找到数字串：

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
	public static void main(String args[]) {
		
		// 按指定模式在字符串查找
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(\\D*)(\\d+)(.*)";
		
		// 创建 Pattern 对象
		Pattern r = Pattern.compile(pattern);
		
		// 现在创建 matcher 对象
		Matcher m = r.matcher(line);
		if (m.find( )) {
			System.out.println("Found value: " + m.group(0) );	//特殊的组（group(0)），代表整个表达式
			System.out.println("Found value: " + m.group(1) );	//非数字字符匹配
			System.out.println("Found value: " + m.group(2) );	//数字字符匹配
			System.out.println("Found value: " + m.group(3) ); 	//其他
		} else {
			System.out.println("NO MATCH");
		}
	}
}