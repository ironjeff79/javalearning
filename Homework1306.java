package Chapter13;
/*运行结果
null,0.0,0.0
11111,1000.0,0.99
 */

/*在恰当的时间使用super(实际参数列表);
注意：虽然调用构造方法，在构造方法执行过程中一连串调用了父类的构造方法，父类的构造方法又继续向下调用他的父类的构造方法，但是对象只创建了一个。
super()实参的作用是：
   初始化当前对象的父类型特征。并不是创建新对象。

super关键字代表什么？
   代表的就是“当前对象”的那部分父类型特征。
*/
public class Homework1306 {
	public static void main(String[] args) {
		CreditAccount ca1 = new CreditAccount();
		System.out.println(ca1.getActno() + "," +ca1.getBalance() + "," + ca1.getCredit());
		CreditAccount ca2 = new CreditAccount("11111",1000.0,0.99);
		System.out.println(ca2.getActno() + "," +ca2.getBalance() + "," + ca2.getCredit());
	}

}


//账户
class Account{  
	//属性
	private String actno;
	private double balance;
	//构造方法
	public Account() {
		
	}
	public Account(String actno,double balance) {
		this.actno = actno;
		this.balance = balance;				
	}
	//set和get
	public void setActno(String actno) {
		this.actno = actno;		
	}
	public String getActno() {
		return actno;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
}

//信用账户
class CreditAccount extends Account{  
	//属性 信誉度
	private double credit;
	//构造方法
	public CreditAccount(){
	}
	//提供有参数的构造方法
	public CreditAccount(String actno,double balance,double credit) {
		//私有的属性只能在本类中访问。
		/*
		this.actno = actno;
		this.balance = balance;
		*/
		//以上的两行代码在恰当的位置，正好可以使用super(actno,balance);
		//通过子类的构造方法调用父类的构造方法。
		super(actno,balance);
		this.credit = credit;
	}
	//set和get
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getCredit() {
		return credit;
	}
	
}