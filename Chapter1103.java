package aa;
/*运行结果
i = 100
Main begin 
*/

public class Chapter1103 {
	// 静态变量在什么时候初始化？类加载时初始化。
    // 静态变量存储在哪里？方法区
	
	static int i = 100;
	
	//静态代码块什么时候执行？类加载时执行。
	//只要是代码一定是存储在方法区的。
	static {
		System.out.println("i = " + i);
	}
	
/*	
	//实例变量
	int k = 100;   k变量是实例变量，在构造方法执行时内存空间才会开辟
	static {
		System.out.println("k = " + k);		static静态代码块在类加载时执行，并且只执行一次。k变量无法访问，在类加载时，k变量空间还没有开辟出来
	}
*/	

	//程序入口（main方法执行之前已经执行了很多代码）
	public static void main(String[] args) {
		System.out.println("Main begin");
		
	}

}


/*总结：
 有顺序要求的java程序有哪些？
 1 对于一个方法来说，方法体中的代码是有顺序的，遵循自上而下的顺序执行
 2 静态代码块1和静态代码块2是有先后顺序的
 3 静态代码块和静态变量是有先后顺序的





*/


