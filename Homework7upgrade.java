package aa;
/*运行结果
7
int求和
30
long求和
30
double求和
30.0
55
66
6.2270208E9
120
*/
		
public class Homework7upgrade {
	public static void main(String[] args) {
		zuiXiaoZhiSshu(7);
		System.out.println(sum(10,20));
		System.out.println(sum(10L,20L));
		System.out.println(sum(10.0,20.0));
		
		//1-10的和
		System.out.println(sum(10));
		System.out.println(summ(11));
		System.out.println(multiply(13));
		System.out.println(multiply2(5));
		
	}
	
	public static void zuiXiaoZhiSshu(int n) {
		while(!isZhiShu(n)) {
			n++;			
		}
		System.out.println(n);
	}
	
	public static boolean isZhiShu(int num) {
		for(int i = 2;i < num; i++ ) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

/*使用方法重载机制
  1	代码整齐美观
  2	“功能相似”的，可以让“方法名相同”，更易于以后的代码编写
	
		
在java语言中，是怎么进行方法区分的呢？
首先java编译器会通过方法名进行区分。
但是在java语言中允许方法名相同的情况出现。
如果方法名相同的情况下，编译器会通过方法的参数类型进行方法的区分。
	
		
方法重载(overload):
    什么时候需要考虑使用方法重载？
    在同一个类当中，如果“功能1”和“功能2”它们的功能是相似的，那么可以考虑将它们的方法名一致。
    
    什么时候代码会发生方法重载？
    条件1：在同一个类当中
    条件2：方法名相同
    条件3：参数列表不同
    只要同时满足以上3个条件，那么可以认定方法之间发生了重载机制。
    
    方法重载和方法的“返回值类型”无关
    方法重载和方法的“修饰符列表”无关
    
    参数类型可以随便传，这说明println()方法重载了
    		
*/	
	
	public static int sum(int a,int b) {
		System.out.println("int求和");
		return a + b;
	}
	public static long sum(long a,long b) {
		System.out.println("long求和");
		return a + b;
	}
	public static double sum(double a,double b) {
		System.out.println("double求和");
		return a + b;
	}
	
//方法递归？
//方法自己调用自己，就是递归
/*	public static void doSome() {
		System.out.println("doSome begin");
		doSome();
		System.out.println("doSome over");
	}
	
1 当递归时程序没有结束条件，一定会发生：栈内存溢出错误（StackOverFlowError）,因此递归必须要有结束条件。	
2 假设结束条件是合法的，递归有时候也会出现内存溢出错误。因为有可能递归的太深，栈内存不够，一直在压栈。递归的使用不当，会导致JVM死掉。
3 在实际的开发中，不建议轻易的选择递归，能用for循环或者while循环代替的，尽量用循环来做。因为循环的效率高，耗费的内存少。
	 	
*/	

//单独编写一个计算1-n和的方法
	public static int sum(int n) {
		int result = 0;
		for(int i = 1;i <= n; i++) {
			result += i;			
		}
		return result;
	}
	
//修改为递归的方式
	public static int summ(int n) {
		if(n == 1) {
			return 1;
		}
		return n + summ (n-1);
	}

	
//使用递归方式计算N的阶乘
	public static double multiply(int n) {
		if(n == 1) {
			return 1;
		}
		return n * multiply (n-1);
	}

	public static int multiply2(int n) {		
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	
	
}
