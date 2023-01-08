package Chapter13;
/*运行结果
A类的无参数构造方法
B类的有参数构造方法(String)
B类的无参数构造方法
*/
/*super是一个关键字，全部小写。
  和this对比着学习。
1 this：
      this能出现在实例方法中和构造方法中。
      this的语法是"this." "this()"
      this不能使用在静态方法中。
      this大部分情况下是可以省略的。
      什么时候不能省略？在区分局部变量和实例变量的时候不能省略。
      public void setName(String name){
         this.name = name;
         }
      this()只能出现在构造方法第一行，通过当前的构造方法去调用“本类”中其他的构造方法，目的是：代码复用。
      
2 super：
      super能出现在实例方法中和构造方法中。
      super的语法是"super." "super()" 
      super不能使用在静态方法中。  
      super大部分情况下是可以省略的。
      什么时候不能省略？？？？
      super()只能出现在构造方法第一行，通过当前的构造方法去调用“父类”中其他的构造方法，目的是：创建子类对象的时候，先初始化父类特征。
      
3 super() 
      表示用过子类的构造方法调用父类的构造方法。
      模拟现实世界中的这种场景：要想有儿子，需要先有父亲。
      
4 重要结论：
      当一个构造方法第一行：
      既没有this(),又没有super()的话，默认会有一个super();表示通过当前子类的构造方法调用父类的无参数构造方法。所以必须保证父类的无参数构造方法是存在的。

5 注意：
      this()和super()不能共存，它们都是只能出现在构造方法第一行。
      
  
*/
public class Chapter1303super {
	public static void main(String[] args) {
		//创建子类对象
		new B(); 
		
	}

}


class A{
	//建议手动的将一个类的无参数构造方法写出来。
	public A() {
		System.out.println("A类的无参数构造方法");
	}
	//一个类如果没有手动提供任何构造方法，系统会默认提供一个无参数构造方法。
	public A(int i){
		System.out.println("A类的有参数构造方法(int)");
	}
}

class B  extends A{	
	public B() {
		this("zhangsan");
		//super(123);
		System.out.println("B类的无参数构造方法");
	}
	public B(String name) {
		System.out.println("B类的有参数构造方法(String)");
	}
}