package Chapter13;
/*运行结果
 鸟儿在唱歌!!!
 猫正在抓老鼠!!! 
 */
public class Homework1302 {
	public static void main (String[] args) {
		Animals x = new Birds();
		Animals y = new Cats();
		
		if(x instanceof Birds) {
			Birds b = (Birds)x;
			b.sing();
		}else if (x instanceof Cats) {
			Cats c = (Cats)x;
			c.catchMouse();
		}
		if(y instanceof Birds) {
			Birds b = (Birds)y;
			b.sing();
		}else if (y instanceof Cats) {
			Cats c = (Cats)y;
			c.catchMouse();
		}
	}

}
