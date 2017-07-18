//http://www.runoob.com/java/java-loop.html

public class LoopWhile {
	public static void main(String []args) {
		int i = 0;
		while ( i <= 10 ){
			System.out.println("i£º" + i );
			if (i == 5 ){
				break;
				//continue;
			}
			i++;
		}
	}
}