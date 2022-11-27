package aa;
/*关于java语言中的浮点型数据
   float   4个字节  单精度  3.33333
   double  8个字节  双精度  3.333333333333
注意：用在银行或者财务方面，double也是远远不够的，在java中有一个专门的类型，叫做：java.math.BigDecimal(不是基本数据类型，属于引用数据类型)

float和double存储数据的时候都是存储的近似值（用一个有限的资源表示无限的数据）

long类型占用8个字节 float类型占用4个字节  任意一个浮点型都比整数型空间大

java中规定，任何一个浮点数据默认被当作double来处理。如果想让这个浮点字面量被当作float类型来处理，那么要在字面量后面添加F/f

*/
public class 第四章2 {
   public static void main(String[] args){
 //这个不存在类型转换 3.1415926是double类型
  double pi = 3.1415926;
  System.out.println(pi);
  
 // cannot convert from double to float
 // float f = 3.14;
 //第一种方式：字面量后面添加F/f 
  float f = 3.14f; 
 //第二种方式：强制类型转换，但可能损失精度，谨慎使用。
  float ff = (float)3.14;
  System.out.println(f);
  System.out.println(ff);
  
  //从double转换到int可能会有损失  int i = 10.0/5;
  //原理：先将5转换成double类型，然后再做运算，结果是double（大容量无法直接赋值给小容量，需要强转）
  int i = (int)10.0/5;
  int ii = (int)(10.0)/5;
  System.out.println(i);
  System.out.println(ii);
  
/*关于java语言中的布尔型数据
 只有true和false两个值，实际开发中使用在逻辑判断当中，通常放在条件的位置上（充当条件）
*/
  
  Boolean sex = true; 
  if (sex) {
	  System.out.println("male");
  }else {
	  System.out.println("female");
  }
  
  
  int a = 10;
  int b = 20;
  System.out.println(a<b);  //true
  System.out.println(a>b);  //false
  boolean flag =(a<b);   //运算符是有优先级的，不确定可以加小括号。
  System.out.println(flag);
  
  
/*类型转换规则
 1八种基本数据类型除了Boolean，剩下七种类型之间都可以进行转换
 2如果整数型字面量没有超出byte short char的取值范围的时候，这个整数可以赋值给byte short char类型的变量 
 3小容量向大容量转换称为自动类型转换，容量从小到大的排序为：byte<short(char)<int<long<float<double,
  其中short和char都占用两个字符，但是char可以表示更大的正整数 
 4大容量转小容量称为强制类型转换，编写时必须添加“强制类型转换符”，但运行是可能出现精度损失，谨慎使用
 5byte,short,char类型混合运算时，先各自转换成int类型再做运算
 6多种数据类型混合运算，各自先转换成容量最大的那一种再做运算 
  
  byte b1 = 1000;   超出范围
  byte b2 = 20;
  short s = 1000;
  int c = 1000;
  long d = c;
  int e = d; 编译报错，类型不兼容
  int f = 10 / 3;
  long g = 10;
  int h = g / 3;编译报错，类型不兼容
  long m = g / 3;
  byte x = (byte)g / 3;编译报错， 3还是int类型，运算结果也是int类型
  short y = (short) (g / 3);
  short i = 10;
  byte j = 5;
  short k = i + j; 编译报错 运算结果是int类型
  int n = i + j;
  char cc = 'a';
  System.out.println(cc); //'a'
  System.out.println((byte)cc);  //97
  int o = cc + 100;  //197
  System.out.println(o);    
*/
   
  
   }
}