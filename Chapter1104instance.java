package aa;
/*运行结果
main begin
实例语句块执行
无参数构造方法
实例语句块执行
无参数构造方法
实例语句块执行
有参数的构造方法
实例语句块执行
有参数的构造方法


*/
/*
 1 除了静态代码块之外，还有一种语句块叫做：实例语句块
 2 实例语句在类加载时并没有执行
 3 实例语句语法？
   {
      java语句;
      java语句;
      java语句;
   }
 4 实例语句块在什么时候执行？
 只要是构造方法执行，必然在构造方法执行之前，自动执行“实例语句块”中的代码
 这也是SUN公司为java程序员准备的一个特殊的时机，叫做对象构建时机

*/
public class Chapter1104instance {
	//程序入口
	public static void main (String[] args){
		System.out.println("main begin");
		new Chapter1104instance();
		new Chapter1104instance();
		new Chapter1104instance("abc");
		new Chapter1104instance("xyz");
	}
	
	//实例语句块
	{
		System.out.println("实例语句块执行");
	}
    
	
	//Constructor
	public Chapter1104instance(){
		System.out.println("无参数构造方法");
	}
	//Constructor
	public Chapter1104instance(String name) {
		System.out.println("有参数的构造方法");
	}

}
