package Chapter13;
/*运行结果
张三正在说汉语。。。
Jack is speaking English。。。
 
*/
public class Homework13anli1 {
	public static void main(String[] args) {
		//创建中国人对象
		//ChinaPeople p1 = new ChinaPeople("张三");   错误原因 没有这样的构造方法
		ChinaPeople p1 = new ChinaPeople();
		p1.setName("张三");
		p1.speak();
	 
		//创建美国人对象
		American p2 = new American();
		p2.setName("Jack");
		p2.speak();
		
	}

}

//人
class People{
	//属性
	private String name;
	//构造
	public People() {}
	public People(String name) {
		this.name = name;
	}
	//set和get
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//人都会说话
	public void speak() {
		System.out.println(name + "正在说话。。。");		
	}
}

//中国人
class ChinaPeople extends People{
	//中国人说话是汉语
	public void speak() {
		System.out.println(this.getName() + "正在说汉语。。。");		
	}
}

//美国人
class American extends People{
	public void speak() {
		System.out.println(this.getName() + " is speaking English。。。");		
	}
}
