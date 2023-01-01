package aa;
/*运行结果
 成功存入：100.0
成功取出：960.0
余额不足，取钱失败
 */
/*写一个名为Account的类模拟账户
 该类的属性和方法如下所示
 该类包括的属性：账户id，余额balance，年利率annualInterestRate：
 包含的方法：各属性的set和get方法。取款方法withdraw();存款方法deposit();
 
 写一个测试程序
 1 创建一个Customer，名字叫做Jane Smith，他有一个账号为1000，余额为2000，年利率为1.23
 2 对Jane Smith操作：
 存入100元，再取出960元，再取出2000元。
 打印Jane Smith的基本信息
 信息如下：
 成功存入：100
 成功取出：960
 余额不足，取钱失败

 */
public class Homework1104 {
	public static void main(String[] args) {
		//先创建一个账户对象
		Account a = new Account("1000",2000,1.23);
		//创建客户对象
		//传给构造方法a是什么意思？让Customer对象和Account对象产生关系。
		Customer2 c = new Customer2("Jane Smith",a);
		c.getAct().deposit(100);
		c.getAct().withdraw(960);
		c.getAct().withdraw(2000);
		
	
	}

}
//以后都是封装，所有的类都是属性私有化，对外提供set和get方法。
//客户类
class Customer2{
	private String name;
	private Account act;
	//构造方法
	public Customer2() {
		
	}
	public Customer2(String name,Account act) {
		this.name = name;
		this.act = act;
	}
	//为什么要写set和get？用不着也得写，因为这是“封装”规定的
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAct(Account act) {
		this.act = act;
	}
	public Account getAct() {
		return act;
	}
}

//账户类
class Account{
	private String id;
	private double balance;
	private double annualInterestRate;
	
	//构造方法
	public Account() {
		
	}
	public Account(String id,double balance,double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	public void setId(String id) {
		//对象创建完之后，想修改id属性调用此方法。
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	//存款方法
	//参数表示存多少钱
	public void deposit(double money) {
		//this(向this指向的对象中存款)
		//this.balance += money;    也可以
		this.setBalance(this.getBalance() + money);
		System.out.println("成功存入：" + money);	
	}
	
	//取款方法
	//调用取钱的方法时，应该传递过来一个参数，告诉该方法要取多少钱
	public void withdraw(double money) {
		if(money > this.getBalance()) {
			System.out.println("余额不足，取钱失败");
			return;
		}
		this.setBalance(this.getBalance() - money);
		System.out.println("成功取出：" + money);		
	}

}
