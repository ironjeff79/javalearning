package Chapter13;

public class Cats extends Animals {
	//对move方法进行重写
	public void move() {
		System.out.println("猫在走猫步!");
	}
	
	//猫除了move之外，应该有自己特有的行为，例如抓老鼠
	public void catchMouse() {
		System.out.println("猫正在抓老鼠!!!");
	}
	public void eat() {
		System.out.println("猫咪喜欢吃鱼，吃得很香!!!");
	}

}
