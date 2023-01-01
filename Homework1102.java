package aa;
/*运行结果 张三的妻子是李四
定义丈夫类Husband和妻子类Wife
丈夫类的属性包括：身份证号，姓名，出生日期，妻子。
妻子类的属性包括：身份证号，姓名，出生日期，丈夫。
分别给这两个类提供构造方法（无参数构造方法和有参数构造方法都要提供），编写测试程序，
创建丈夫对象，然后再创建妻子对象，丈夫对象关联妻子对象，妻子对象关联丈夫对象，要求能够输出这个“丈夫对象”的妻子的名字。
或者能够输出这个“妻子”对象的丈夫的名字，要求在程序中演示出空指针异常的效果。
*/
public class Homework1102 {
	public static void main(String[] args) {
		//创建丈夫对象
		Husband h = new Husband("1111111","张三","1998-10-11",null);
		//创建妻子对象
		Wife w = new Wife("222222","李四","1998-10-11",null);
		//产生联系	
		h.wife = w;
		w.husband = h;
		//输出丈夫的妻子名字
		//当没有结婚的时候，出现空指针异常
		System.out.println(h.name + "的妻子是" + h.wife.name);
	}	
}

/*重点
  .后面只是一个单词，没有小括号，表示访问的是属性
  .后面有一个单词，单词后面有小括号，表示访问的是方法
 
*/


class Husband{
	String idCard;
	String name;
	String birth;
	Wife wife;
	//无参数构造方法
	public Husband(){
		
	}
	//有参数的构造方法
	public Husband(String s1,String s2,String s3,Wife w) {
		idCard = s1;
		name = s2;
		birth = s3;
		wife = w;
	}
}

class Wife{
	String idCard;
	String name;
	String birth;
	Husband husband;
	//无参数构造方法
	public Wife() {
		
	}
	//有参数的构造方法
	public Wife(String s1,String s2,String s3,Husband h) {
		idCard = s1;
		name = s2;
		birth = s3;
		husband = h;
	}
	
}