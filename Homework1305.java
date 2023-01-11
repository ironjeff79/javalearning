package Chapter13;
/*运行结果
1
3
6
5
4
在java语言中不管是new什么对象，最后Object类的无参数构造方法一定会执行，且一定是最先执行。

栈顶的特点：
   最后调用，但是最先执行结束。后进先出原则。
 */


public class Homework1305 {
	public static void main(String[] args) { 
		new Z();
	}

}

class X{
	public X() {
		System.out.println("1");
	}
}

class Y extends X{
	public Y() {
		System.out.println("2");
	}
	public Y(String name) {
		System.out.println("3");
	}
}

class Z extends Y{
	public Z() {
		this("zhangsan");
		System.out.println("4");
	}
	public Z(String name) {
		this(name,20);
		System.out.println("5");
	}
	public Z(String name,int age) {
		super(name);
		System.out.println("6");
	}
}
