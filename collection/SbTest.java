package collection;
/*运行结果
101
100
1234
1234
false true  
*/
public class SbTest {
	public static void main(String[] args) {
		int x = 100;
		int y = x;
		x++;
		System.out.println(x);
		System.out.println(y);
		StringBuilder sb1 = new StringBuilder("123");
		StringBuilder sb2 = sb1;
		sb1.append("4");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println((x == y) + " " + (sb1 ==sb2));
	}

}
