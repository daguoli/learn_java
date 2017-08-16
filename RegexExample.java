//http://www.runoob.com/java/java-regular-expressions.html

import java.util.Arrays;
import java.util.regex.*;

public class RegexExample {
   public static void main(String args[]) {
	   // 用 matches 匹配字符串
	   String content = "I am noob " + "from runoob.com.";
	   String pattern = ".*runoob.*";
	   boolean isMatch = Pattern.matches(pattern, content);
	   System.out.println("字符串是否包含了'runoob'子字符串：" + isMatch );
	   System.out.println();
	   
	   // 用 split 分割字符串
	   String src = "http://gitlab.alipay-inc.com/internal_release/imobilegw/tree/ANT02220651_20170814_imobilegw";
	   String regEx="/";
	   Pattern p=Pattern.compile(regEx);
	   String[] r=p.split(src);
	   System.out.println(Arrays.toString(r));
	   
	   String groupName=r[3];  //internal_release
	   String projectName=r[4];//imobilegw
	   String branchName=r[6];	//ANT02220651_20170814_imobilegw
	   System.out.println("groupName:" + groupName );
	   System.out.println("projectName:" + projectName);
	   System.out.println("branch:" + branchName);
	   
   }
}

