package Chapter13;
/*运行结果
请输入要猜测的数字：
89
猜小了
请输入要猜测的数字：
101
猜大了
请输入要猜测的数字：
100
猜测成功
 */

/*猜数字游戏
一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
另外再定义一个类B，对A类的实例变量v进行猜测。
如果大了则提示大了，小了则提示小了。等于则提示猜测成功。 
*/
public class Homework1308 {
	public static void main(String[] args) {
		AA a = new AA(100);
		BB b = new BB(a);
		java.util.Scanner s = new java.util.Scanner(System.in);
		while (true) {
			System.out.println("请输入要猜测的数字：");
			int guessNum = s.nextInt();
			b.guess(guessNum);
		}
	}
}




class AA{
	private int v;
	public AA(){}
	public AA(int v) {
		this.v = v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public int getV(){
		return v;
	}
}


class BB{
	//通过B猜测A 在B对象中有一个A对象的引用
	//把A作为B的实例变量
	private AA a;//通常初学者会卡在这里。不知道将A设置为B的一个属性。
	
	public BB() {}
	public BB(AA a) {
		this.a = a;
	}
	public void setAA(AA a) {
		this.a = a;
	}
	public AA getAA() {
		return a;
	}
	//猜测的方法
	public void guess(int guessNum){
		//实际数字
		//int shiJiZhi = this.getA().getV();
		int shiJiZhi = a.getV();
		if(guessNum == shiJiZhi) {
			System.out.println("猜测成功");
			System.exit(0);
		}else if(shiJiZhi > guessNum) {
			System.out.println("猜小了");
		}else {
			System.out.println("猜大了");
		}
	}
}