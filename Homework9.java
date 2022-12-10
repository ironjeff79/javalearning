package aa;
/*运行结果
add --->11
mian --->10
 */


//分析程序的输出结果
//java中规定：参数传递的时候，和类型无关，不管是基本数据类型还是引用数据类型，统一都是将盒子中保存的那个“值”复制一份，传递下去。
//内存地址也是值，也是盒子中保存的一个东西。

public class Homework9 {
	public static void main(String[] args) {
		int i = 10;
		add(i);
		System.out.println("mian --->" + i);
		
		
	}


	public static void add(int i) {
		i++;
		System.out.println("add --->" + i);
  }
}


