package Chapter13;
/*运行结果
 鸟儿在飞翔！
 这个动物是一只小鸟
 */
/* 回顾:方法重载 overload
   条件一： 在同一个类当中
   条件二： 方法名相同
   条件三： 参数列表不同（个数，顺序，类型） 
 
  方法覆盖
 什么时候我们会考虑使用方法覆盖呢？
 子类继承父类之后，当继承过来的方法无法满足当前子类的业务需求时，子类有权利对这个方法进行重新编写，有必要进行“方法覆盖”。
 方法覆盖也可以叫做方法重写，override，overwrite
 
 重要结论：
  当子类对父类继承过来的方法进行“方法覆盖”之后，子类对象调用该方法的时候，一定执行覆盖之后的方法。
 
 怎么编写可以实现：
  条件一 两个类必须要有继承关系
  条件二 重写之后的方法和之前的方法具有相同的返回值类型，方法名，和形式参数列表
  条件三 访问权限不能更低，可以更高
  条件四 重写之后的方法不能比之前的方法抛出更多的异常，可以更少
 
 注意事项：（与多态有关）
  注意1：方法覆盖只是针对于方法，和属性无关
  注意2：私有方法无法覆盖
  注意3：构造方法不能被继承，所以构造方法也不能被覆盖
  注意4：方法覆盖只是针对于实例方法，静态方法覆盖没有意义 
  


关于Object类中的toString()方法
1 toString()方法的作用是什么？
  作用：将“java对象”转换成“字符串的形式”

2 Object类中的toString()方法的默认实现是什么？

  public String toString(){
     return getClass().getName() + "@" + Integer.toHexString(hashCode());
  }
  toString:方法名的意思是转换成String
  含义：调用一个java对象的toString()方法就可以将该java对象转换成字符串的表示形式。 

3 那么toString()方法给的默认实现够用吗？
  

*/
public class Chapter13 {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.move();
		//重写toString()方法之前的结果
		//System.out.println(b.toString());  Chapter13.Bird@49e4cb85
		//重写toString()方法之后的结果
		System.out.println(b.toString()); //这个动物是一只小鸟
	}

}

//父类
class Animal{
	
	//移动
	public void move() {
		System.out.println("动物在移动");
	}
}


//子类
class Bird extends Animal{
	public void move() {
		System.out.println("鸟儿在飞翔！");
	}
	public String toString(){
    	return "这个动物是一只小鸟";			
	}
}

class Cat extends Animal{
	public void move() {
		System.out.println("猫在走猫步！");
    }
}