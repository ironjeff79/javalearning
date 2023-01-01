package aa;
/*运行结果
 main类加载时执行！
Student类加载时执行！
实例语句块，构造方法执行一次，这里就执行一次！
张三正在努力学习!
张三在餐厅吃饭呢!
Student's m1 method execute!
工作性质：学习
实例语句块，构造方法执行一次，这里就执行一次！
 */
/*程序再怎么变化，万变不离其宗，有一个固定的规律:
    所有的实例相关的都是先创建对象，通过“引用.”来访问。
    所有的静态相关的都是直接采用“类名.”来访问。
    
    main方法是静态的，JVM调用main方法的时候直接采用的是“类名.”的方式
    所以main方法中没有this
 
*/
/*
  类体{
     实例变量;
     实例方法;
     
     静态变量;
     静态方法;
     
     构造方法;
     
     静态代码块;
     实例语句块;
     
     方法(){
       // 局部变量
        int i = 100;
      }
   }  

*/
public class Homework1105zongjie { //类
	//类加载机制中，在程序执行之前，凡是需要加载的类全部加载到JVM当中。
	//先完成加载，才会执行main方法。
	
	static{
		System.out.println("main类加载时执行！");
	}
	//入口
	//静态方法
	public static void main(String[] args) {
		//局部变量
		int i = 100;
		
		//完成一个对象的一连串动作
		Student s1 = new Student();
		s1.study();
		Student s2 = new Student(35,"李四");
	}

}

//学生类
class Student{
	
	static{
		System.out.println("Student类加载时执行！");
	}
	//学号
	private int no;  //实例变量
	//姓名
	private String name;
	//类级别的属性
	static String job = "学习"; //静态变量
	{
		System.out.println("实例语句块，构造方法执行一次，这里就执行一次！");
	}
	
	//构造方法
	public Student() {
		//假设调用无参数的构造方法，默认创建的学生学号是100，名字是张三
		this(100,"张三");   //这里使用了this() 
		
	}
	public Student(int no,String name) {
		this.no = no; //这里使用了this
		this.name = name;
	}
	
	//封装
	//set和get方法
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getNo() {
		return no;
	}
	
	//提供两个实例方法
	public void study() {
		System.out.println(this.name + "正在努力学习!");
		this.eat();
	}
	public void eat() {
		System.out.println(this.name + "在餐厅吃饭呢!");
		//调用静态m1()方法
		//静态方法使用“类名.”的方式访问
		Student.m1(); //类名可以省略  java在检测到是静态方法后会自动添加
	}
	//提供两个静态方法
	public static void m1() {
		System.out.println("Student's m1 method execute!");
		System.out.println("工作性质：" + Student.job);
		
	}
	
	
	
	
}
