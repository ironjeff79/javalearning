package aa;
/*运行结果
中国
123456789
张三
987654321
李四
*/

/*static 翻译为“静态的”
 1 所有static关键字修饰的都是类相关的，类级别的，不需要new对象
 2 所有static修饰的，都是采用“类名.”的方式访问
 3 static修饰的变量：静态变量
 4 static修饰的方法：静态变量
 
 变量的分类：
   根据生成的位置进行划分:
   在方法体当中声明的变量叫做：局部变量
   在方法体外声明的变量叫做：成员变量
   
 成员变量可以分为：
    实例变量
    静态变量
    
class Test{
//以下实例的，都是对象相关的，访问时采用“引用.”的方法访问，需要new对象。
//实例相关的，必须先有对象，才能访问，可能会出现空指针异常
//成员变量中的实例变量
 int i;
 实例方法
 public void m2(){
       局部变量
       int x = 200;
 }
 
//以下静态的，都是类相关的，访问时采用“类名.”的方法访问，不需要new对象。
//不需要对象的参与即可访问，没有空指针异常的发生。
//成员变量中的静态变量
 static int k;
//静态方法
 public static void m1(){
        局部变量
     int m = 100;   
 }      

  什么时候变量声明为实例的，什么时候声明为静态的？
  如果这个类型的所有对象的某个属性值都是一样的，不建议定义为实例变量，浪费内存空间。
  建议定义为类级别特征，定义为静态变量，在方法区中只保留一份，节省内存开销。
  
  一个对象一份的是实例变量   一定需要使用“引用.”来访问
  所有对象一份的是静态变量   建议使用“类名.”来访问，但使用“引用.”也行（但会让人产生困惑）
  
  
另：空指针异常只有在什么情况下才会发生呢？
   只有在“空引用”访问“实例”相关的，都会出现空指针异常
 
 */
public class Chapter11static {
	public static void main (String[] args) {
		//访问中国人国籍，静态变量应该使用类名.的方式访问
		System.out.println(Chinese.nationality);
		Chinese c1 = new Chinese("123456789","张三");
		Chinese c2 = new Chinese("987654321","李四");
		System.out.println(c1.idCard);
		System.out.println(c1.name);
		System.out.println(c2.idCard);
		System.out.println(c2.name);
		
		
	}

}

//定义一个类 中国人
class Chinese{
	//身份证号
	String idCard;
	
	//姓名
	String name;
	
	//国籍
	//对于中国人这个类来说，国籍都是“中国”，不会随着对象的改变而改变
	//重点：静态变量在类加载时初始化，不需要new对象，静态变量的空间就开出来了，静态变量存储在方法区
	static String nationality = "中国";
	
	//无参数
	public Chinese() {
		
	}
	//有参数
	public Chinese(String s1,String s2) {
		idCard = s1;
		name = s2;
		
	}	
	
}





