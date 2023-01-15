package Chapter13;
/*运行结果
起步
size 5
speed 120
speed 130
speed 110
*/
/*定义一个交通工具（Vehicle）类
其中有属性
speed
size
方法
move
setSpeed(int speed)
speedUp()
speedDown()

最后在测试类Vehicle中的main()中实例化一个交通工具对象
并通过方法给它初始化speed，size的值并且打印出来
另外调用加速减速的方法对速度进行改变。

*/
public class Homework1309 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.move();
		v.setSize(5);
		v.setSpeed(120);
		System.out.println("size " + v.getSize());
		System.out.println("speed " + v.getSpeed());
		
		
		//调用加速方法
		v.speedUp(10);
		System.out.println("speed " + v.getSpeed());
		//调用减速方法
		v.speedDown(20);
		System.out.println("speed " + v.getSpeed());		
	}
	

}


class Vehicle{
	private int speed;
	private int size;
	public Vehicle() {}
	public Vehicle(int speed,int size) {
		this.speed = speed;
		this.size = size;
		}
	//设置速度方法	
	public void setSpeed(int speed) {
		this.speed = speed;
		}
	public int getSpeed() {
		return speed;
	}
	public void setSize(int size) {
		this.size = size;
		}
	public int getSize() {
		return size;
	}
	//移动方法
	public void move() {
		System.out.println("起步");
	}
	
	//加速方法
	public void speedUp(int addSpeed) {
		int oldSpeed = this.getSpeed();
		this.setSpeed(this.getSpeed() + addSpeed);
	
	}
	//减速方法
	public void speedDown(int subSpeed) {
		int oldSpeed = this.getSpeed();
		this.setSpeed(this.getSpeed() - subSpeed);
		
	}
		
	
}


