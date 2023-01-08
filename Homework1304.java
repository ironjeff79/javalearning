package Chapter13;
/*运行结果
二胡的声音!!!
钢琴的声音!!!
小提琴的声音!!!
*/

/*
编写程序实现乐手弹奏乐器，可以弹奏的乐器包括二胡，钢琴和琵琶。
*/

public class Homework1304 {
	public static void main(String[] args) {
		//创建各种乐器
		Instrument erhu = new Erhu();
		Instrument piano = new Piano();
		Instrument violin = new Violin();
		//创建乐手对象
		Musician m = new Musician();
		m.play(erhu);
		m.play(piano);
		m.play(violin);
		
	}

}


//乐手·
/*第一种写法
    class Musician{
	//实例变量
	Instrument i;
	//构造方法
	public Musician() {
	}
	public Musician(Instrument i) {
		this.i = i;
	}
	//play()方法
	public void play() {
		i.makeSound();
	}
}
*/
//第二种写法
class Musician{
	public void play(Instrument i) {
		i.makeSound();
	}
}

//乐器·
class Instrument{
	public void makeSound() {
		
	}
}

class Erhu extends Instrument{
	public void makeSound() {
		System.out.println("二胡的声音!!!");
	}
}

class Piano extends Instrument{
	public void makeSound() {
		System.out.println("钢琴的声音!!!");
	}
}
class Violin extends Instrument{
	public void makeSound() {
		System.out.println("小提琴的声音!!!");
	}
}