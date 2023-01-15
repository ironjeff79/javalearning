package Chapter13;
/*运行结果
姓名： JEFF 年龄： 19
*/
/*编写java程序用于显示人名和年龄
定义一个类Person该类中应该有两个私有属性姓名name和年龄age
定义构造方法用来初始化数据成员，再定义显示display方法将姓名和年龄打印出来。
在main方法中创建人类实例然后将信息显示  
*/
public class Homework1311 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("JEFF");
		p.setAge(19);
		p.display();		
	}
	

}

class Person{
	public void display() {
		//System.out.println("姓名： " + this.getName() + "年龄： " + this.getAge());
		System.out.println("姓名： " + name + " 年龄： " + age);
		//System.out.println("姓名： " + this.name + "年龄： " + this.age);		
	}
	
	private String name;
	private int age;
	
	public Person() {}
	public  Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}


