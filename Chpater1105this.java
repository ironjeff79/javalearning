package aa;
/*运行结果
张三正在购物!
李四正在购物!  
*/
/* this 
 1 this 是一个关键字，全部小写
 2 this是什么？在内存方面是怎样的？
   一个对象一个this 
   this是一个变量，是一个引用
   this保存当前对象的内存地址，指向自身。
   所以严格意义上来说，this代表的就是“当前对象”，存储在堆内存当中对象的内部。
 3 this只能使用在实例方法中，谁调用实例方法，this就是谁
   所以this代表的是当前对象  
 4 “this.”大部分情况下是可以省略的。 
 5 为什么this不能使用在静态方法中？

*/
public class Chpater1105this {
	public static void main(String[] args) {
		Customer1 c1 = new Customer1("张三");
		c1.shopping();
		Customer1 c2 = new Customer1("李四");
		c2.shopping();
		
		
		
	}

}


//顾客类
class Customer1{
	//属性
	//实例变量（必须采用“引用.”的方式访问）
	String name;
	//构造方法
	public Customer1() {	
	}
	public Customer1(String s) {
		name = s;
	}

	//顾客购物的方法
	public void shopping() {
		//这里的this是谁？this是当前对象
		//System.out.println(this.name + "正在购物!");
		//this.是可以省略的。省略之后还是默认访问“当前对象”的name
		System.out.println(name + "正在购物!");
		
	}

/*
	public static void doSome(){
		//this代表的是当前对象，而静态方法的调用不需要对象。矛盾了
		//错误：无法从静态上下文中引用非静态变量this
		System.out.println(this);
	}
*/
}
