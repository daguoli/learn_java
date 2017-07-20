//http://www.runoob.com/java/java-regular-expressions.html
//下面是一个对单词 "cat" 出现在输入字符串中出现次数进行计数的例子：

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches2 {
	public static void main(String args[]) {
		
		// 按指定模式在字符串查找
		String line = "cat cat cat cattie cat";
		String pattern = "\\bcat\\b";
		
		// 创建 Pattern 对象
		Pattern r = Pattern.compile(pattern);

		//创建 matcher 对象
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