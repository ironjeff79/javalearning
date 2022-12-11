package aa;
/*运行结果
 0
20
输入的年龄不合法
20 
 */
/*面向对象的三大特征：
   封装 继承 多态
  有了封装，才有继承，有了继承，才能说多态。
  
  什么是封装？有什么用？
  1 保证内部结构的安全 
  2 屏蔽复杂，暴露简单
 
 在代码级别上，封装的作用
    一个类体当中的数据，假设封装之后，对于代码的人调用人员来说，不需要关心代码的复杂的实现，只需要通过一个简单的入口就可以访问。
    另外，类体中安全级别较高的数据封装起来，外部人员不得随意访问，来保证数据的安全性。
    
 怎么进行封装？
 一 属性私有化（使用private关键字进行修饰）
 二 对外提供简单的操作入口(提供get和set方法，外部程序只能通过set方法修改，可以在set方法中设立关卡，来保证数据的)
 
 重点强调：
    set和get方法都是实例方法，不能带static
    不带static的方法称为实例方法，实例方法的调用必须先new对象  
  
  
  
  
 */
public class Chapter10 { 
	public static void main(String[] args) {
		//创建对象
		Person1 p1 = new Person1();
	    //通过“类名”无法调用get和set方法。只有方法修饰符列表中有static的时候，才能使用“类名.”的方式访问
	    //int nianLing = p1.getage();
	    //System.out.println(nianLing);
		System.out.println(p1.getage());
		
		p1.setage(20);
		System.out.println(p1.getage());
		p1.setage(-50);
		System.out.println(p1.getage());
		
    }
	
}
