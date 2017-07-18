//http://www.runoob.com/java/java-regular-expressions.html

import java.util.regex.*;

public class RegexExample {
   public static void main(String args[]) {
	   String content = "I am noob " + "from runoob.com.";
	   String pattern = ".*runoob.*";
	   
	   boolean isMatch = Pattern.matches(pattern, content);
	   System.out.println("×Ö·û´®ÊÇ·ñ°üº¬ÁË'runoob'×Ó×Ö·û´®£º" + isMatch );
	   
   }
}