package aa;
/*题目：
   业务：从键盘上接收天气的信息
	  1表示：雨天
	  2表示:晴天
   同时从键盘上接收性别的信息
      1表示：男
      2表示：女
   业务要求：当天气是雨天的时候
       男的：打一把大黑伞
       女的：打一把小花伞
           当天气是晴天的时候
       男的：直接走起，出去玩耍
       女的：擦点防晒霜，出去玩耍
需要使用if语句以及嵌套的方式展现这个业务

            可以在程序的开始接收两个数据，一个数据是天气，一个数据是性别，然后将这两个数据保存到变量中

	
*/
public class Homework602 {
	public static void main(String[] args) {
		//接收用户键盘输入
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入您的性别，输入1表示男，输入0表示女：");
		int gender =s.nextInt();
		if(gender != 1 && gender != 0) {
			return;
		}
		//System.out.println(gender);
		//提示信息
		System.out.print("请输入当前的天气，1表示雨天，0表示晴天：");
		//等待用户的输入
		int weather = s.nextInt();
		//System.out.println(weather);
		if (weather == 1) {
			//System.out.println("雨天");
			if(gender == 1) {
				System.out.println("记得拿一把大黑伞");
			}else if(gender == 0) {
				System.out.println("记得拿一把小花伞");
			}
		}else {
			//System.out.println("晴天");
			if(gender == 1) {
				System.out.println("天气不错，出去玩耍吧");
			}else if(gender == 0) {
				System.out.println("天气不错，记得擦点防晒霜");
			}
		}
	
	}

}
