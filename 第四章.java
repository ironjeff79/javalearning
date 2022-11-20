/*
数据类型    74行字符型char   118行整数型int
1.1 数据类型的作用
   用来声明变量，程序在运行过程中根据不同的数据类型分配不同大小的空间
   int i =10; 
   double d = 1.23; 
   i和d变量类型不同，空间大小也不同
   
1.2 数据类型在java语言中包括两种：
  第一种：基本数据类型
     基本数据类型又可以划分为4大类8小种类；
        第一类：整数型
        第二类：浮点型
        第三类：布尔型
        第四类：字符型
        8小种：
           byte，short，int，long
           float，double
           boolean
           char
           
  第二种：引用数据类型   
     字符串型String属于引用数据类型
     String字符串不属于基本数据类型范畴
     java中除了基本数据类型之外，剩下的都是引用数据类型
     
1.3 8种基本数据类型中
   整数型：  byte，short，int，long 有什么区别
   浮点型：  float，double有什么区别
   区别： 占用的空间大小不同
   
   byte b = 2; 在计算机中是这样表示的： 00000010
   short s = 2; 在计算机中是这样表示的： 00000000 00000010
   int i = 2; 在计算机中是这样表示的： 00000000 00000000 000000000 00000010
   
   类型        占用字节数量     取值范围
----------------------------------------------------   
   byte            1           -128~127 
   short           2          -32768~32767
   int             4        -2147483648~2147483647
   long            8
   float           4
   double          8
   boolean         1 
   char            2            0~65535
   
注意：在计算机当中，一个二进制位最左边的是符号位，当为0时表示正数，当为1时表示负数。所以byte类型最大值是：01111111
   
十进制二进制转二进制：除以2，余数逆序输出   
二进制二进制转十进制：2的次方  
   
   
什么是字符编码？
   文字不能直接通过“自然算法”转换成二进制。
   字符编码是人为的定义的一套转换表   
   在字符编码中规定了一系列的文字对应的二进制
   
字符编码涉及到编码和解码的两个过程，编码和解码的时候必须采用同一套字符编码方式，不然就会出现乱码
随着计算机的发展，最先支持的是英文，英文对应的字符编码方式是:ASCII码   
ASCII码采用1byte进行存储，因为英文字母是26个。   
   
   'a' ---> 97  -->01100001
   'A' ---> 65
   '0' ---> 48
   
后来国际标准组织制定了ISO-8859-1编码方式，又称为latin-1编码方式，向上兼容ASCII码，但不支持中文。
中文的编码方式 GB2312 < GBK  < GB18030(容量的关系)

在java中，java语言中为了支持全球所有的文字，采用了一种字符编码方式叫做unicode编码，支持所有文字。具体的实现包括：UTF-8 UTF-16 UTF-32




字符型：char
1. char占用2个字节
2. char的取值范围：0~65535
3. char采用unicode编码方式
4. char类型的字面量使用单引号括起来
5. char可以存储一个汉字
*/

package aa;

public class 第四章 {
  public static void main (String[] args) {
    char c1 = '0';
    System.out.println(c1);
    //普通的't'字符
    char c2 = 't';
    System.out.println(c2);
    // \t表示制表符tab
    char c3 = '\t';
    System.out.println(c3);
    System.out.println("abcde\tf");
    //  \' 表示一个普通单引号字符
    System.out.println('\'');
    //  在java中两个反斜杠代表了一个普通的反斜杠字符
    System.out.println('\\');
    //  双引号括起来的是字符串
    System.out.println("test");
    //  如果希望输出的结果是 “test”
    System.out.println("\"test\"");
    // 反斜杠u、表示后面的是一个字符的unicode编码 unicode编码是十六进制的
    char x = '\u4e2d';
    System.out.println(x);

/*
java中的转义字符
  java语言中"\"负责转义

System.out.print(); 不换行
System.out.println();  换行
'\n' 换行符
*/

    System.out.println("十进制："+10);
    System.out.println("八进制："+010);
    System.out.println("十六进制："+0x10);
    System.out.println("二进制："+0b10);
    
/*
在任何情况下，整数型的“字面量/数据”默认被当作int类型处理
如果希望该“整数型字面量”被当作long类型来处理，需要在“字面量”后面添加L/l
*/


//小容量可以自动转换成大容量，这种操作被称为：自动类型转换
//b变量是long类型，int类型占4个字节，long类型占8个字节
    long b = 200;
    System.out.println(b);
//下面这个不存在类型转换
    long c = 200L;
    System.out.println(c);
    long d = 2147483647;
    System.out.println(d); 
    long e = 2147483648L;
    System.out.println(e);
    
    
//大容量转换成小容量，要想编译通过，必须加强制类型转换符，进行强制类型转换。
    long xy = 100L;
    int yx = (int)xy;    //这个（int）就是强制类型转换符 虽然编译通过了，但是运行时可能损失精度，会将前面的四个字节砍掉
    byte bb = (byte)300;
    System.out.println(bb);
    System.out.println(yx); //把256砍掉了 就剩44
    
    
/*整数能否直接赋值给char    
   char = 97 
   这个语句是允许的，并且输出结果是'a'
   1 当一个整数赋值给char类型变量的时候，会自动转换成char字符型，最终的结果是一个字符
   2 当一个整数没有超出byte short char的取值范围的时候，这个整数可以赋值给byte short char类型的变量
*/    
    char cc = 97;
    System.out.println(cc);
    
//098 二进制原码反码补码（听过就行）
    
    
//byte char short做混合运算的时候，各自先转换成int再做运算    
    byte bbb = 1;
    short s = (short)(cc + bbb);   //short s = cc + bbb 这个语句编译器不知道这个加法最后的结果是多少，只知道是int类型
    System.out.println(cc + bbb);
    System.out.println(s);
    
    
    
/*多种数据类型混合运算   
 最终结果类型是“最大容量”对应的类型   
*/   
    long l = 10L;
    char ccc = 'a';
    short ss =100;
    int i =30;
    //求和
    System.out.println(l+ccc+ss+i);
    //cannot convert from long to int （计算结果是long类型）
    //int xxx = l+ccc+ss+i;
    int xxx = (int) (l+ccc+ss+i);
    System.out.println(xxx);
    
    
    
    
    
 }
}

