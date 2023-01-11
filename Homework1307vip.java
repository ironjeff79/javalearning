package Chapter13;
/*运行结果
null正在购物！
zhangsan正在购物！
null正在购物！ 
*/
/*this.和super.大部分情况下都是可以省略的。
this.什么时候不能省略？
    public void setName(String name){
       this.name = name;
    }
super.什么时候不能省略？
    父类中有，子类中又有，想在子类中访问“父类”的特征。

java是怎么来区分子类和父类的同名属性的？         
    this.name 当前对象的name属性
    super.name 当前对象的父类特征中的name属性
  
  
重点： 1 super不是引用，也不保存内存地址，也不指向任何对象。只是代表当前对象内部的那一块父类型的特征。  
      2 在父和子中有同名的属性，或者说有相同的方法，如果此时想在子类中访问父中的数据，必须使用“super.”加以区分。

*/
public class Homework1307vip {
	public static void main(String[] args) {
		Vip v = new Vip("zhangsan");
		v.shopping();
	}

}

class Customer{
	String name;
	public Customer() {}
	public Customer(String name) {
		this.name = name;
	}
}

class Vip extends Customer{
	//假设子类也有一个同名属性
	//java中允许在子类中出现和父类一样的同名变量/同名属性。
	String name;
	public Vip() {}
	public Vip(String name) {
		super(name);
	}
	public void shopping() {
		System.out.println(this.name + "正在购物！");
		System.out.println(super.name + "正在购物！");
		System.out.println(name + "正在购物！");
	}
}