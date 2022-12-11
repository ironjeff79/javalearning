package aa;

public class Person1 {
	private int age; //private表示私有了，被这个关键字修饰之后，该数据只能在本类中访问。

	/*对外提供简单的访问入口 外部程序只能通过以下的代码来完成访问
	  思考：应该对外提供几个访问入口？这些操作入口是否应该是方法呢？
	  
	  写一个方法专门来完成读（get）
	  写一个方法专门来完成写（set）
      get读年龄，set改年龄，都是操作的一个对象的年龄。（没有对象没有这个年龄）
      封装的第二步：对外提供公开的set方法和get方法作为操作入口，并且都不带static，都是实例方法。
      [修饰符列表]返回值类型 方法名(形式参数列表){
      }
	
	
	 注意：
	    java开发规范中有要求，set方法和get方法要满足以下格式。
	    get方法的要求：
	       public 返回值类型 get+属性名首字母大写(无参){
	       }
	       
	    set方法的要求：
	       public void set+属性名首字母大写(有一个参数){
	          xxx = 参数;
	       }   
	
	*/
	//get方法
	public int getage() {
		return age;
	}
	
	//set方法
	public void setage(int nianLing) {
		if(nianLing < 0 || nianLing >= 150) {
			System.out.println("输入的年龄不合法");
			return;
		}
		age = nianLing;
	}
}
