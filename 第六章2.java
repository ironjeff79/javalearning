package aa;
//switch语句和循环语句（70行）

/* Switch语句
 1 也是选择语句，也可以叫做分支语句
 2 switch语句的语法格式
   switch(值){
   case 值:
       java语句；
       java语句；
       break;
   case 值:
       java语句；
       java语句；
       break;
   case 值:
       java语句；
       java语句；
       break;
    default：
       java语句;       
   }
以上是一个完整的switch语句，其中break和default分支不是必须的

switch语句支持的值有哪些？
int类型以及string类型（JDK8之后，开始支持string类型）
但是byte，short，char也可以使用在switch语句当中，因为可以自动类型转换。

switch语句中“值”与“值1”，“值2”比较的时候会使用“==”进行比较

 3 拿“值”与“值1”进行比较，如果相等，则执行该分支中的java语句，然后遇到break语句，语句就结束了
  如果不相等，会“值”与“值2”进行比较，如果相等，则执行该分支中的java语句，然后遇到break语句，语句结束
 注意：如果分支执行了，但是分支没有break，此时会发生case穿透现象。
 
 所有的case都没有匹配成功，那么最后default分支会执行。
 
*/

public class 第六章2 {
	public static void main(String[] args) {
	//接收键盘输入，根据输入的数字来判断星期几
	// 0星期日 1星期一 
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入[0-6]的整数：");
		int num =s.nextInt();
		switch(num) {
		case 0:
			System.out.println("星期日");
			break;
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");

//关于default语句，当所有的case都没有匹配上的时候，执行default语句。			
		}
/*循环语句
  for循环 while循环 do..while循环
  为什么要使用这种语句？
  现实世界中，有很多事情都是需要反复/重复的去做。对应到程序当中，如果有一块代码需要重复执行，为了减少代码量，会使用循环语句。
  
for循环的语法机制以及运行原理？
for(初始化表达式；布尔表达式；更新表达式){
    循环体；//循环体由java语句构成
    java语句;
    java语句;
    java语句;
    .....
}
注意： 1初始化表达式最先执行，并且在整个循环中只执行一次
      2条件表达式结果必须是一个布尔类型，也就是true或false
      3初始化表达式，条件表达式，更新表达式其实都不是必须的
      
执行原理：
		先执行初始化表达式，然后判断条件表达式的结果，如果条件表达式的结果为true，则执行循环体。
		循环体结束之后，执行更新表达式。
		更新完之后，再判断条件表达式的结果，如果还是true，继续执行循环体。
		如果还是true，继续执行循环体。
		直到更新表达式执行结束之后，再次判断条件时，条件为false，for循环终止。
	更新表达式的作用是：控制循环的次数，换句话说，更新表达式会更新某个变量的值，
	这样条件表达式的结果才有可能从true变成false，从而终止for循环的执行。	
	
 
*/
		for(int i = 0;i < 10; i++) {
			System.out.println("i =" + i);
			}
//变形			
/*      for(int i = 1;i <= 10; ) {
			System.out.println("i =" + i);
			i++;
		
		for(int i = 1;i <= 10; ) {
			i++;
			System.out.println("i =" + i); //2 3 4 5 6 7 8 9 10 11
        
        for(int i = 10;i > 0; i-- ) {
			System.out.println("i =" + i); //10 9 8 7 6 5 4 3 2 1
			
		for(int i = 0;i < 10; i+=2 ) {
			System.out.println("Value1 =" + i); //0 2 4 6 8
			
		for(int i = 100;i > 0; i%= 3) {
			System.out.println("Value2 =" + i); //100 1	1 ... 1死循环
*/
		
//使用for循环，实现1-100所有基数求和 
		int sum = 0;
		for (int y = 1; y < 100; y += 2 ) {
			sum += y;  			
		}
		System.out.println("1-100的奇数和结果是" + sum);

/* 1 所有合法的“控制语句”都可以嵌套使用 	
   2 for循环嵌套一个for循环执行原理是什么？在分析外层for循环的时候，把里面的for就当做一段普通的java语句/代码
   例：
      for(int k = 0;k < 2; k++){                   //循环两次 0-9
          for(int i = 0;i < 10; i++) {
			System.out.println("i =" + i);
			}
      }
      
      int i = 0;
      for(int k = 0; k < 2; k++){                   //循环一次 0-9
          for(;i < 10; i++) {
			System.out.println("i =" + i);
			}
      }

*/	
		
		
//九九乘法表
//	1共九行	
//  2第一行一个，第二行两个，第n行n个		
		for (int i = 1; i <= 9; i++) {
			//负责输出一行的。（内部for循环负责将一行上的全部输出）
			for (int k = 1; k <= i; k++ ) {
				System.out.print(k + "*"+ i +" = " + i * k + "  ");
			}
			//换行
			System.out.println();
		}
			
	}
	
}
