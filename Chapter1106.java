package aa;
/*运行结果
 1900年1月1日
2000年10月11日
*/
/*1 this除了可以使用在实例方法中，还可以用在构造方法中。
  2 新语法：通过当前的构造方法去调用另一个本类的构造方法，可以使用以下语法格式：
     this (实际参数列表);
     通过一个构造方法1去调用构造方法2，构造方法1和2都是在同一个类中。
  3 this() 这个语法的作用是代码复用
  4 对this的调用必须是构造器中的第一个语句，只能出现在构造方法的第一行
 */
public class Chapter1106 {
	public static void main(String[] args) {
		Date d = new Date();
		d.detail();
		
		Date d1 = new Date(2000,10,11);
		d1.detail();
		
	}

}


/*需求:
 1 定义一个日期类,可以表示年月日信息
 2 需求中要求：
   如果调用无参数构造方法，默认创建日期为1900年1月1日
   
*/


class Date{
	private int year;
	private int month;
	private int day;
	//构造参数方法
	//调用无参数构造方法，初始化的日期是固定值
	public Date() {
		/*
		this.year = 1900;
		this.month = 1;
		this.day = 1;
		*/
		this(1900,1,1);
	}
	//构造方法有参数
	public Date(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//提供一个可以打印日期的方法
	public void detail() {
		System.out.println(year + "年" + month + "月" + day + "日");
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear(){
		return year;	
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth(){
		return month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay(){
		return day;
	}
}