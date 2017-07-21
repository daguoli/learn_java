//以下实例中我们通过字符串函数 substring() 函数来删除字符串中的一个字符，我们将功能封装在 removeCharAt 函数中。

package instance;

public class DeleteLastString{
	public static void main(String []args) {
		String str = "this is Java";
		System.out.println(str);
		
		System.out.println(removeCharAt(str, 2));
	}
	
	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}
}