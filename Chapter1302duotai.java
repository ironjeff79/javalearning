package Chapter13;
/*运行结果
动物在移动！
猫在走猫步!
鸟儿在飞翔！
猫在走猫步!
猫正在抓老鼠!!!

 */
/*多态的基础语法：
  1 首先普及两个概念
     a. 向上转型   子 —-— > 父 （自动类型转换） upcasting
     b. 向下转型   夫 —-— > 子 （强制类型转换，需要加强制类型转换符） downcasting
   注意：java中允许向上转型和向下转型，无论是哪一种，两种类型之间必须有继承关系，否则编译器报错。
   什么时候必须向下转型：调用子类对象上特有的方法时。  
*/
public class Chapter1302duotai {
	public static void main (String[] args) {
		Animals a1 = new Animals();
		a1.move();
		
		Cats c1 = new Cats();
		c1.move();
		
		Birds b1 = new Birds();
		b1.move();
		
		Animals a2 = new Cats();
		a2.move();
		
		Animals a3 = new Cats();
		// a3.catchMouse();    编译失败  去Animals.class文件中找catchMouse方法，没有找到，所以静态绑定失败。
		//此时需要向下转型
		Cats x = (Cats)a3; //因为a5是Animals类型，转成Cats，Animals和Cats之间存在继承关系，所以没报错。
		x.catchMouse();
		
		//向下转型的风险
	    /*编译不报错 检测到a4这个引用是Animals类型，而Animals和Cats之间存在继承关系，所以可以向下转型。
	      运行报错   运行阶段堆内存实际创建的对象是Birds对象。在实际运行过程中，拿着Birds对象转换成Cats对象就不能运行了。因为两者之间没有继续关系。
	     
	      Exception in thread "main" java.lang.ClassCastException:class Chapter13.Birds cannot be cast to class Chapter13.Cats 
	     
	      java.lang.ClassCastException类型转换异常
	      怎么避免这个异常的发生？
	      
	      运算符：instanceof
	      第一  instanceof可以在运行阶段动态判断引用指向的对象的类型。
	      第二  instanceof的语法：
	               (引用 instanceof 类型)  
	      第三  instanceof运算符的运算结果只能是true/false
	      第四  假设(c instanceof Cats)为true表示：
	               c引用指向的堆内存中的java对象是一个Cats
	            假设(c instanceof Cats)为false表示：
	               c引用指向的堆内存中的java对象不是一个Cats
	               
	      养成好习惯！ 任何时候，对类型进行向下转型时，一定要使用instanceof运算符进行判断。         
	    */
		Animals a4 = new Birds();
		if (a4 instanceof Cats) {
			Cats y = (Cats)a4;
			y.catchMouse();	
		}
		
		
		
		
	}

}

/*什么是多态
 分析 a2.move();
 java程序分为编译阶段和运行阶段。
     编译阶段：
         对于编译器来说，编译器只知道a2的类型是Animals，所以编译器在检查语法的时候，
         会去Animals.class字节码文件中找move()方法，编译通过，静态绑定成功。（编译阶段属于静态绑定）
     运行阶段：
         运行阶段的时候，实际上在堆内存中创建的java对象是Cats对象，所以move的时候，真正参与move的对象是一只猫，
         所以运行阶段会动态执行Cats对象的move()方法。这个过程属于运行阶段绑定。（运行阶段绑定属于动态绑定）

 多态指的是：
     父类型引用指向子类型对象
     包括编译阶段和运行阶段
     编译阶段：绑定父类的方法
     运行阶段：动态绑定子类型对象的方法       
     多种形态
 
 多态在开发中有什么作用？
     降低程序的耦合度，提高程序的扩展力。
 
 面向对象的三大特征：
     封装，继承，多态
     有了封装这种整体的概念之后，对象和对象之间产生了继承，有了继承之后，才有了方法覆盖和多态。
     
     
*/

