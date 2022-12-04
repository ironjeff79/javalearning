package aa;

public class Homework7 {
	public static void main(String[] args) {

/*提取一个方法来计算某个数的阶乘
 		int i = 5;
		int result = 1;
		for(int n = i; n > 1; n--) {
			result  *= n;
		}
		System.out.println(result);
*/
		
		int retValue1 = jieCheng(5);
		int retValue2 = jieCheng(8);
		System.out.println(retValue1);
		System.out.println(retValue2);
		
		//例 大于5的最小的质数
		int n = 5;
		while (true) {
			n++;
			boolean flag = isZhiShu(n);
			if (flag) {
				System.out.println(n);
				break;
			}
		}
		
		zuiXiaoZhiShu(33);  //输出大于某个正帧数的n的最小的质数
		zuiXiaoZhiShu(55);
		
		
		boolean flagg = isZhiShu(13);
		System.out.println(flagg ? "质数" : "非质数");
		
	}
	
	public static int jieCheng(int i) {
		int result = 1;
		for(int n = i; n > 1; n--) {
			result  *= n;
		}
		return result;
	}	

//编写一个方法，输出大于某个正帧数的n的最小的质数
	//例 大于5的最小的质数
	public static void zuiXiaoZhiShu(int n) {
		while(true) {
			n++;
			boolean flag = isZhiShu(n);
			if(flag) {
				System.out.println(n);
				break;
			}
		}
	}
	
				
	
	
	

	public static boolean isZhiShu(int num) {
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}


}

