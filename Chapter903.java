package aa;
/*运行结果
无参数的构造方法执行
无参数的构造方法执行
aa.XueSheng@7c30a502
aa.XueSheng@49e4cb85

   构造方法 Constructor【构造器】
  1   什么是构造方法？
    是一个比较特殊的方法，通过构造方法可以完成对象的创建，以及实例变量的初始化。换句话说，构造方法是用来创建对象，并且同时给对象的属性赋值。
    （注意：实例变量没有手动赋值的时候，系统会赋默认值）
      构造方法作用？
    创建对象，并且创建对象的过程中给属性赋值（初始化）。  
      
      
  2   重点 
    当一个类没有提供任何构造方法，系统会默认提供一个无参数的构造方法。（而这个构造方法被称为缺省构造器）
  
  3   如何调用构造方法？
    使用new运算符来调用构造
       new 构造方法名(实际参数列表);
  
  4   构造方法的语法结构？
    [修饰符列表]构造方法名(形式参数列表){
        构造方法体;
  }
     
 注意：
 第一 修饰符列表目前统一写：public （不是 public static） 
 第二 构造方法名和类名必须一致
 第三 构造方法不需要指定返回值类型，也不能写void，写上void表示普通方法，就不是构造方法了。 
    
     普通方法的语法结构？
    [修饰符列表] 返回值类型 构造方法名(形式参数列表){
        方法体;
  
  5 构造方法
   5.1 当一个类中没有提供任何构造方法，系统默认提供一个无参数的构造方法，叫做缺省构造器。
   5.2 当一个类中手动的提供了构造方法，那么系统将不再提供无参数构造方法。
   5.3 无参数构造方法，和有参数的构造方法都可以调用。
   5.4 构造方法是支持重载的，在一个类中构造方法可以有多个。并且所有构造方法的名字都是一样的。
   方法重载特点：在同一个类中，方法名相同，参数列表不同。
  
  }
  
  
  
 */
public class Chapter903 {
	public static void main(String[] args) {
		new XueSheng();
		//创建Student类型的对象
		XueSheng s1 = new XueSheng();
		System.out.println(s1); //aa.XueSheng@7c30a502
		XueSheng s2 = new XueSheng(100);//aa.XueSheng@49e4cb85
		System.out.println(s2);
		
		//输出“引用” 只要输出结果不是null，说明对象一定是创建完成了
	}

}