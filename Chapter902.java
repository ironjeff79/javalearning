package aa;
/*运行结果
0
客户的id是9521 
 */
public class Chapter902 {
	public static void main(String[] args) {
		//创建客户对象
		Customer c = new Customer();
		//访问这个客户的id
		System.out.println(c.id); //0
		//重新给id赋值
		c.id = 9521;
		System.out.println("客户的id是" + c.id);
		
		/* c = null;
		  System.out.println( c.id);		 
		  NullPointerException
		  编译器没问题，因为编译器只检查语法。c是Customer类型，类型中有id属性。所以 c.id 通过了编译。
		  但是运行的时候需要对象的存在，对象没了只能出现一个异常。
		 
		 关于垃圾回收器GC
		 在java语言中，垃圾回收器主要针对的是堆内存。
		 当一个java对象没有任何引用指向该对象的时候，GC会考虑将该垃圾数据释放回收掉。
		 
		 出现空指针异常的前提条件是？
		 “空引用”访问实例【对象相关】相关的数据时，都会出现空指针异常
		 */
	}

	
}


class Customer{
	//客户id
	int id; //成员变量中的实例变量，应该先创建对象，然后通过“引用”的方式访问
}