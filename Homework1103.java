package aa;
/*运行结果
 教材名称:高等数学 总页数为345
本书页数不能少于200页,默认赋值200
教材名称:高等数学 总页数为200
教材名称:盗梦空间 总页数为459
教材名称:未知 总页数为200 
 */
/*通过代码封装，实现如下需求。
 编写一个类book，代表教材：
 1 具有属性，名称（title），页数（pageNum）
 2 其中页数不能少于200页，否则输出错误信息，并赋予默认值200
 3 为各属性提供赋值和取值方法
 4 具有方法：detail，用来在控制台输出每本教材的名称和页数
 5 编写测试类bookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确 
 
 

*/
public class Homework1103 {
	public static void main(String[] args) {
		Book b = new Book("高等数学",345);
		b.detail();
		b.setPageNum(59);
		b.detail();
		Book b1 = new Book("盗梦空间",459);
		Book b2 = new Book();
		b1.detail();
		b2.detail();
	}

}


class Book{
	private String title;
	private int pageNum;
	//构造方法，无参数
	public Book() {
		title = "未知";
		pageNum = 200;
	}
	//有参数的构造器
	public Book(String s,int i) {
		title = s;
		if(i < 200) {
			pageNum = 200;
			System.out.println("本书页数不能少于200页,默认赋值200");			
		}else {
		pageNum = i;
		}
	}
	
	public void setTitle(String s) {
		title = s;
	}
	public 	String getTitle() {
		return title;
	}
	public void setPageNum(int i) {
		if (i < 200){
			System.out.println("本书页数不能少于200页,默认赋值200");
			pageNum = 200;
			return;
		}
		pageNum = i;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void detail() {
		System.out.println("教材名称:" + title + " 总页数为" + pageNum);
	}
}