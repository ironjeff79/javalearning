package Chapter13;
/*运行结果
狗狗喜欢啃骨头，吃得很香！
猫咪喜欢吃鱼，吃得很香!!!
 */

public class Homework1303 {
	public static void main(String[] args) {
		//创建主人对象
		Master zhangSan = new Master();
		//创建宠物对象
		Dogs heiBei = new Dogs();
		//主人喂
		zhangSan.feed(heiBei);
		//创建宠物对象
		Cats xiaoHua = new Cats();
		zhangSan.feed(xiaoHua);
	}

}
