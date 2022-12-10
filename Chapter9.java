package aa;
/*运行结果
0
 */


/*在语法级别上是怎么完成对象创建的？
   类名 变量名 = new 类名();


*/
public class Chapter9 {
	A o1;  //成员变量中的实例变量，必须先创建对象，通过“引用”来访问。
	
	public static void main (String[] args) {
		D d = new D();
		C c = new C();
		B b = new B();
		A a = new A();
		Chapter9 t = new Chapter9();
		
		
		//这里不屑下面的代码会出现NullPointerException异常。（空指针异常）
		c.o4 = d;
		b.O3 = c;
		a.o2 = b;
		t.o1 = a;
		
		//编写代码通过t来访问d中的i
		//System.out.println(Chapter9.a);  是错误的
		System.out.println(t.o1.o2.O3.o4.i);
	
	}
	
}

class A{
	B o2;
}
class B{
	C O3;
}
class C{
	D o4;
}
class D{
	int i;
}