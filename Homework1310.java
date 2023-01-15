package Chapter13;
/*运行结果
10+0=10
10-0=10
10*0=0
除数不得为0
*/
/*编写java程序模拟简单的计算器
定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
编写构造方法赋予n1和n2初始值
再为该类定义加addition()减subtration()乘multiplication()除division()等公有实例方法。
分别为两个成员变量执行加减乘除。
 
*/
public class Homework1310 {
	public static void main(String[] args) {
		Num n = new Num(10,0);
		n.addition();
		n.subtration();
		n.multiplication();
		n.division();
		
	}

}

class Num{
	private int n1;
	private int n2;
	
	public Num() {}
	public Num(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN1() {
		return n1;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN2() {
		return n2;
	}
	//可以返回值类型为void,也可以是int
	public void addition() {
		//System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
		System.out.println(this.getN1() + "+" + this.getN2() + "=" + (this.getN1() + this.getN2()));
	}
	
	public void subtration() {
		System.out.println(this.getN1() + "-" + this.getN2() + "=" + (this.getN1() - this.getN2()));
	}
	public void multiplication() {
		System.out.println(this.getN1() + "*" + this.getN2() + "=" + (this.getN1() * this.getN2()));
	}
	public void division() {
		if (n2 == 0) {
			System.out.println("除数不得为0");
			return;  
		}
		
		System.out.println(this.getN1() + "/" + this.getN2() + "=" + (this.getN1() / this.getN2()));
	}

}



