package aa;

//计算1000以内所有不能被7整除的整数之和

public class Homework604 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i <= 1000; i++) {
			if(i % 7 == 0) {
				continue;
			}
			sum += i;			
		}
		System.out.println("sum = " + sum);
	
	
//计算1+2-3+4-5+6-7...+100的结果
		int summ = 1;
		for (int ii = 2; ii <= 100; ii++ ) {
			if(ii % 2 == 0){
				summ += ii;
			}else 
				summ -= ii;
		}
		System.out.println("sum = " + summ);
	
//从控制台输入一个正整数，计算该数的阶乘。
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入一个整数 " );
		int num = s.nextInt();
		int result = 1;
		for(int i = num; i > 1 ; i -- ) {
			result *= i;
		}
		System.out.println("result = " + result);
	
//从控制台接收一个正整数，判断该数字是否为质数
		System.out.println("请输入一个整数 " );
		int numm = s.nextInt();
		Boolean zhiShu = true;
		for (int i = 2; i < numm ; i++) {
			if(numm % i == 0 ) {
				zhiShu = false;
				break;
			}
		}
		System.out.println(numm + (zhiShu ? "是" : "不是") +  "质数");
	
	
/*从控制台接收一个正整数，	该正整数作为行数，输出以下图形
		*	
	  * * *
	* * * * *	
*/	
		System.out.println("请输入一个整数 " );
		int rows = s.nextInt();
		for (int i = 1; i <= rows; i++ ) {   //外层循环控制总行数
			//输出空格的循环
			for(int j = 0; j < rows - i ; j++ ) {
				System.out.print( " " );
			}
			//输出星号的循环
			for(int k = 0; k < i*2 - 1 ;k++ ) {
				System.out.print( "*" );
			}
			//以上两个for循环结束之后，表示一行结束 在这里换行
			System.out.println();
		}

//小芳的妈妈每天给她2.5块钱，但是每当这一天是存钱的第五天或者5的倍数的话，她都会花去6元钱，请问，经过多少天，可以存到100元
/*		double money = 0.0;
		int days = 0;
		while (true) {
			days++ ;
			money += 2.5;
			if(days % 5 == 0) {
				money -= 6.0;
			}
			if(money >= 100){
				break;				
			}						
		}
*/
		double money = 0.0;
		int days = 0;
		while(money < 100) {
			days++;
			money += 2.5;
			if(days % 5 == 0) {
				money -= 6;
			}
		}
		System.out.println("小芳通过" + days + "天存到了 " + money + "元");
		

//一个数如果恰好等于他的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3	，找出1000内所有的完数
		
		for(int i = 2;i <= 1000; i++) {
			int summm = 0;
			for(int j = 1;j <= i / 2; j++) {
				if(i % j == 0) {
					summm += j;					
				}
			}
			if(i == summm) {
				System.out.println(i);
			}			
		}					
	}
}
