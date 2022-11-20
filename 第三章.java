package aa;

public class 第三章 {
	public static void main(String[] args) {
		System.out.println(100);
		System.out.println(3.14);
		System.out.println(true);
		System.out.println(false);
		System.out.println('a');
		System.out.println("abc");
		System.out.println('上');
		int nianLing;
		nianLing = 33;
		System.out.println(nianLing);
		//重新赋值
		nianLing = 25;
		System.out.println(nianLing);
		
		int weight = 80;
		System.out.println(weight);
	}
	

}


/*
变量的第一个测试程序：Var是变量
关于程序当中的数据 
现实世界中，有很多问题都是使用数据进行描述的
所以软件执行过程中最主要就是对数据的处理

在java语言中“数据”被称为“字面量”
10       整数型
1.23     浮点型
true     布尔型
false
'a'      字符型
"abc"    字符串型

1什么是变量？
  变量是内存当中存储数据的最基本的单元。
  在java语言当中任何数据都是有数据类型的，整数型是int（integer） JVM会给int分配4个字节大小的空间
  1个字节=8个比特位  比特位是二进制 1个比特位是一个1或0 

数据类型有什么用？
  不同的数据类型，在内存中分配的空间大小不同。

变量的三要素：数据类型，名字，变量中保存的值
类型决定空间的大小 起名是为了以后方便询问 值是变量保存的数据

变量名属于标识符，首字母小写，后面每个单词首字母大写，遵循驼峰命名方式，见名知意

变量怎么声明/定义，语法格式是什么？
 数据类型 变量名；
 例： int nianLing；
在java语言中有一个规定，变量必须先声明，再赋值才能访问。
注意：java可以在一行上同时声明多个变量 int a =10, b =20, c = 100;

变量根据出现的位置进行划分：
  在方法体当中声明的变量：局部变量 
  在方法体之外，类体内声明的变量：成员变量
 
public class Test1{
    //成员变量
  int i = 100;
    //主方法
   public static void main(String[] args){  
     //局部变量
      int k = 100; 
   }
 }
 
 
变量的作用域？ 
   变量的有效范围，一个大括号代表一个域 （出了大括号就不认识了）
   {A域
      {B域
        {C域
         }
       }
     }
   在同一个域中，变量名不能重名
 
 
*/