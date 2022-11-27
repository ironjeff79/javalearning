package aa;
//控制语句30行

/*输出信息到控制台（接收用户键盘输入）
   包括"基本赋值运算符"和"扩展赋值运算符"
                     =          += -= *= /= %=
   接收整数		int userInput = s.nextInt();
   接收字符串	String str = s.next();                  
*/

	
public class 第六章 {
	public static void main(String[] args ) {
 
  //创建一个键盘扫描对象
		java.util.Scanner s = new java.util.Scanner(System.in);  //这行代码写一次就行
  //接收用户的输入，从键盘上接收一个int类型的数据
  //代码执行到这里的时候，会暂停下来，等待用户的输入，用户可以从键盘上输入一个整数，然后回车，		
		int userInput = s.nextInt();
		System.out.println(userInput);
		String str = s.next();
		System.out.println(str);
		
  //完整的
		System.out.println("请输入用户名：");
		String name = s.next();
		System.out.println("欢迎"+name+"回来");
	 

/*控制语句包括几类？
  3类：
    选择语句，循环语句，转向语句

  选择语句：if switch
  循环语句：for while do.while
  转向语句：break continue return
  
  if语句是分支语句，也可以叫做条件语句
  语法格式：
       写法一：如果布尔表达式的结果是true，则执行大括号中的程序，否则不执行。
          if(布尔表达式){
              java语句;
              java语句;           
             }
          
       写法二：如果布尔表达式的结果是true，执行分支一；如果布尔表达式的结果是false，执行分支二。 
           if(布尔表达式){
              java语句;           
             }else{
              java语句;
             }
       
       写法三：
          if(布尔表达式1){
              java语句;           
             }else if(布尔表达式2){
                java语句;
             }else if(布尔表达式3){ 
                java语句;   
             }else if(布尔表达式4){ 
                java语句;
             }
        原理：从上往下依次判断，主要看第一个true发生在哪个分支上
          先判断布尔表达式1，如果布尔表达式1的结果是true，执行分支1，语句结束。     
          当布尔表达式的结果是false，那么会继续判断布尔表达式2的结果，如果布尔表达式2的结果是true，执行分支2，语句结束。
          
       写法四：    
          if(布尔表达式1){
              java语句;           
             }else if(布尔表达式2){
                java语句;
             }else if(布尔表达式3){ 
                java语句;   
             }else if(布尔表达式4){ 
                java语句;
             }else{
                java语句; //以上条件没有一个成立的，这个else就执行了
             }    
             
   **以上4种语法机制中，凡是带有else分支的，一定可以保证会有一个分支执行。          
   **当分支语句只有1条时，大括号可以省略，但为了可读性，最好不要省略。
   **控制语句之间是可以嵌套的，但是嵌套的时候最好一个语句一个语句进行分析。
 	
//if语句案例1
		boolean sex = true;
		if (sex == true) {              // ==是关系运算符，不是赋值运算符，==双等号是用来判断是否相等的。
			System.out.println("男");	
		}else {
			System.out.println("女");
		}  
*/	
//改良 
		boolean sex = true;
		if (sex) {
			System.out.println("男");
		}else {
			System.out.println("女");
		}
//可以再进一步改良
		System.out.println(sex ? "男" : "女");
	
	
/*业务要求：
  1 从键盘上接收一个人的年龄
  2 年龄要求为【0-150】，其他值表示非法，需要提示非法信息
  3 根据人的年龄来动态的判断这个人属于生命的哪个阶段？
    【0-5】婴幼儿
  	【6-10】少儿
  	【11-18】少年
  	【19-35】青年
  	【36-55】中年
  	【56-150】老年
  4	请使用if语句完成以上的业务逻辑
*/  
  java.util.Scanner ss = new java.util.Scanner(System.in);
  System.out.println("请输入年龄：");
  int age = ss.nextInt();
  System.out.println("您输入的年龄是：" + age);
  if (age < 0 || age > 150) {
	  System.out.println("对不起，年龄值不合法");
  }else {
	  if(age <=5) {
		  System.out.println("婴幼儿");		  
	  }else if(age <=10) {
		  System.out.println("少儿");
	  }else if(age <=18) {
		  System.out.println("少年");
	  }else if(age <=35) {
		  System.out.println("青年");
	  }else if(age <=55) {
		  System.out.println("中年");
	  }else {
		  System.out.println("老年");
		  }

//进一步改良	
	  /*String str = "老年";
        if (age < 0 || age > 150) {
	  System.out.println("对不起，年龄值不合法");
	  return;
  }else if(age <=5) {
		  str = "婴幼儿";		  
	  }else if(age <=10) {
		  str = "少儿";
	  }else if(age <=18) {
		  str = "少年";
	  }else if(age <=35) {
		  str = "青年";
	  }else if(age <=55) {
		  str = "中年";
	  }
      System.out.println(str);
		  }
	*/	  
	  
    }  
  }
}
