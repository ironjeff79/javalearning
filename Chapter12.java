package aa;
/*运行结果
1111111,余额100000.0
2222222,余额-100000.0，信誉度0.99
aa.Chapter12@6e8dacdf
*/
/*继承
 1 继承的作用：
     基本作用 子类继承父类，代码可以得到复用。
     主要作用 因为有了继承关系，才有后期的方法覆盖和多态机制。
 
 2 继承的相关特性
   1 B类继承A类，则称A类为超类(superclass)，父类，基类。
     B类则称为子类(subclass)，派生类，扩展类。
     class A {}
     class B extends A {}
    平时更多的说的是父类和子类
   2 java中的继承只支持单继承，不支持多继承，c++中只支持多继承。c++更接近现实一点，因为在现实世界中儿子同时继承父母双方特征。
     java中不允许写这样的代码：class B extends A,C{}
   3 虽然java中不支持多继承，但有时候会产生间接继承的效果，例如： class C extends B，class B extends A，也就是说，C直接继承B，其实C还间接继承A。     
   4 java中规定，子类继承父类，除构造方法不能继承之外，剩下都可以继承。
     但是私有的属性无法在子类中直接访问。(父类中private修饰的不能在子类中直接访问。可以通过间接手段来访问)
   5 java中的类没有显示的继承任何类，则默认继承Object类，Object类是java语言提供的根类，一个对象有Object类型中所有的特征。
   　 String是SUN编写的字符串类，System是SUN编写的系统类。
     jdk源代码的位置 \lib\src.zip
     System.out.println("Hello World");
     System.out中，out后面没有小括号，说明out是变量名。
     另外，System是一个类名，直接使用类名System.out，说明out是一个静态变量。
     System.out返回一个对象，然后采用“对象.”的方式访问println()方法。
     以上代码中 System,out,println都是标识符。
     
     public class Object{
         //当源代码中一个方法以“;”结尾，并且修饰符列表中有“native”关键字，表示底层调用C++写的dll程序(dll动态链接库文件)
         private static native void registerNatives();
         //静态代码块
         static {
         //调用registerNatives()方法
            registerNatives();
           }
         //无参数构造方法  
         @HotSpotIntrinsicCandidate
         public Object(){}
         
         //底层也是调用C++
         @HotSpotIntrinsicCandidate
         public final native Class<?>getClass();
         
         //底层也是调用C++
         @HotSpotIntrinsicCandidate
         public native int hashCode();
         
         public boolean equals(Object obj){
             return (this == obj);
          }
        
         //已有对象a，想创建一个和a一模一样的对象，你可以调用这个克隆方法。
         //底层也是调用C++
        @HotSpotIntrinsicCandidate
        protected native Object clone() throws CloneNotSupportedEcception;     
         
         Object类中还有很多方法，其中有一个叫做toString()的，测试后发现：
         System.out.println(引用);
         当直接输出一个引用的时候，println()方法会先自动调用“toString()”。 下面82行
         
              
   6 继承也存在一些缺点，耦合度高，父类修改，子类受牵连。
     例如:CreditAccount类继承Account类会导致它们之间的耦合度非常高，Account类发生改变之后会马上影响到CreditAccount类。
*/
public class Chapter12 {
	public static void main(String[] args) {
		//创建普通账户
		Account1 act = new Account1();
		act.setActno("1111111");
		act.setBalance(100000);
		System.out.println(act.getActno() + ",余额" + act.getBalance());
		//创建信用账户
		CreditAccount ca = new CreditAccount();
		ca.setActno("2222222");
		ca.setBalance(-100000);
		ca.setCredit(0.99);
		System.out.println(ca.getActno() + ",余额" + ca.getBalance() + "，信誉度" + ca.getCredit());
		
		/*public String toString(){
		      return getClass().getName() + "@" + Integer.toHexString(hashCode());
		   }   		 
		 */
		Chapter12 ch = new Chapter12();
		String retValue = ch.toString();
		System.out.println(retValue); //aa.Chapter12@6e8dacdf   @后面可以看作对象在堆内存当中的内存地址，是内存地址经过“哈希算法”得出的十六进制结果。
	}

}

//银行账户类
//账户的属性：账号，余额
class Account1{  //父类
	//属性
	private String actno;
	private double balance;
	//构造方法
	public Account1() {
		
	}
	public Account1(String actno,double balance) {
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

//其他类型的账户：信用卡账户
//账号，余额，信誉度
class CreditAccount extends Account1{  //子类
	//属性
	private double credit;
	//构造方法
	public CreditAccount(){
	}
	public void doSome() {
		//错误： actno在Account中是pivate访问控制
		//System.out.println(actno);
		//间接访问
		System.out.println(this.getActno());
	}
	//set和get
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getCredit() {
		return credit;
	}
	
}


