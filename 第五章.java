package aa;
//算术运算符4行     关系运算符53行     逻辑运算符67行
/*
算术运算符：
  +    求和
  -    相减
  *    乘积
  /    商
  %    求余数
  ++   自加1 (可以出现在变量前，也可以出现在变量后)
  --   自减1
*/




public class 第五章 {
   public static void main(String[] args ) {
	   int a = 10;
	   int b = 3;
	   System.out.print(a + b);
	   System.out.print(a - b);
	   System.out.print(a * b);
	   System.out.print(a / b);
	   System.out.print(a % b);
	   int i = 10;
	   i++;
	   System.out.println(i);
	   
//++出现在变量前和变量后有什么区别？
//当++出现在变量后，会先做赋值运算，再自加1	   
       int m = 20;
       int n = m++;
       System.out.println(n);
       System.out.println(m);
	   
//当++出现在变量前，会先进行自加1的，然后再赋值	 	   
       int x = 100;
       int y = ++x;
       System.out.println(x);
       System.out.println(y);

//题目
       int c = 90;
       System.out.println(c++);
       System.out.println(c);
       
       int d = 80;
       System.out.println(++d);
       System.out.println(d);
       
        
/*关系运算符  !!!所有的关系运算符的运算结果都是布尔类型
  >  >=  <  <=  ==(判断是否相等)  !=       
*/  
       
       int aa = 10;
       int bb = 10;
       System.out.println(aa>bb);
       System.out.println(aa>=bb);
       System.out.println(aa<bb);
       System.out.println(aa<=bb);
       System.out.println(aa==bb);
       System.out.println(aa!=bb);
       

/*逻辑运算符： 两边都要求是布尔类型，并且最终的运算结果也是布尔类型
    &	逻辑与(并且)
    |	逻辑或
    !	逻辑非(取反)
    &&	短路与	
    ||	短路或 
  
   对于逻辑&运算符来说，只要有一边是false，结果就是false
   只有两边同时为true，结果才是true
   对于逻辑|,只要有一边是true，结果就是true
    
   短路与&&和逻辑与&有什么区别？
     首先这两个运算符的运算结果没有任何区别，完全相同
     只不过短路&&会发生短路现象       
*/         
       //System.out.println(true & true);
       //System.out.println(true & false);
       //System.out.println(false & false);
       //System.out.println(true && true);
       //System.out.println(true && false);
       //System.out.println(false && false);
       
       
       
//短路现象(效率更高)     使用短路与&&的时候，当左边的表达式为false的时候，右边的表达式不执行，这种现象被称为短路  
       
  int xx = 10;
  int yy = 11;
  System.out.println(xx > yy & xx < yy++);     
  //左边的x>y表达式结果已经是false，整个表达式的结果已经确定是false，按道理来说右边的表达式不应该执行。
  System.out.println(yy); //12
  //通过这个测试得出： x>y++ 这个表达式执行了  
  
//什么时候发生短路或现象？ 当左边表达式结果是true的时候，右边的表达式不需要执行，此时会短路。       
         
   }
}
