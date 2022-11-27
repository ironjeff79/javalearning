package aa;
//赋值运算符3行	  条件运算符25行
/*
 赋值运算符  包括"基本赋值运算符"和"扩展赋值运算符"
                       =          += -= *= /= %=
*/
public class 第五章2 {
	public static void main(String[] args ) {
		int i = 10;
		i += 20;
		System.out.println(i);
		
		byte x = 100;   //100没有超出byte类型取值范围，可以直接赋值	
		//x = x + 1;  //cannot convert from int to byte  检测到 x + 1是int类型 
		x += 1;  //
		System.out.println(x);
//使用扩展赋值运算的时候，永远不会改变运算结果类型
				
		
/*条件运算符
  语法格式：
   布尔表达式？表达式1：表达式2
  
  执行原理：
    布尔表达式的结果为true时，表达式1的执行结果作为整个表达式的结果
    布尔表达式的结果为false时，表达式2的执行结果作为整个表达式的结果 		 
*/		
		boolean sex = true;
		char c = sex ? '男' : '女';
		System.out.println(c);
		

/* + 运算符
	 1、 + 运算符在java语言中有两个作用
	  	 作用1：求和
	  	 作用2：字符串拼接
	 2、 什么时候求和？什么时候字符串拼接？ 	  	 
	     当 + 运算符两边都是数字的时候，求和
	     当 + 运算两边的“任意一边”是字符串类型，那么这个+会进行字符串拼接操作
	     字符串拼接完之后的结果还是一个字符串	 
*/	
		int nianLing = 35;
		System.out.println("年龄=" + nianLing);
        
		int a = 100;
		int b = 200;
		int d = a + b;
		System.out.println(a + b + "110"); //结果是一个字符串 300110
		System.out.println(a + (b + "110")); //结果是 100200110
		
	//在控制台上输出 “100+200=300”	
		System.out.println(a +"+"+ b +"="+ d);
		System.out.println(a +"+"+ b +"="+ a + b);  //结果是100+200=100200
		System.out.println(a +"+"+ b +"="+ (a + b));  //结果是100+200=300
		
		
		
//作业：
        int i1 = 10;
        i1 = i1++;
        System.out.println(i1);   //结果是10      
/*在c++中运行结果是11，java中运行结果是10
  编译器是不同的人开发的，原理不同
*/		
		int i2 = 10;
		int aa = i2 +i2++;  //该行代码结束，i2就变成11
		System.out.println("aa = " + aa);  //结果是20
		System.out.println("i2 = " + i2);  //结果是11
		
		
	}
}
