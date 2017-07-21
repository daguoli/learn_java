//以下实例中我们通过字符串函数 string.lastIndexOf(Stringname) 来查找子字符串 Stringname 在 strOrig 出现的位置：

package instance;

public class SearchlastString{
	public static void main(String []args) {
		String str = "sdj Hello world ,Hello Runoob"; //从0开始计数，空格也算字符
		int lastIndex = str.lastIndexOf("Hello");
		if(lastIndex == - 1){
			System.out.println("没有找到字符串 Hello");
		}else{
			System.out.println("Hello 字符串最后出现的位置： "+ lastIndex);
		}
	}
}