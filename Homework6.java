/*package aa;
/*题目：
1 系统接收一个学生的考试成绩
2 要求成绩是一个合法的数字，成绩必须在【0-100】之间，可能带有小数点。
3 等级
    优 【90-100】
	良 【80-90】
	中 【70-80】
	及格 【60-70】
	不及格 【0-60】

*/  

package aa;
public class Homework6 {
	public static void main(String[] args) {
		//键盘扫描器对象
		java.util.Scanner v = new java.util.Scanner(System.in);
		//考试成绩带有小数
		double score = v.nextDouble();
		//判断考试成绩
		String str = "优";
		if(score < 0 || score > 100) {
			str = "成绩不合格";
		}else if(score < 70) {
			str = "合格";
		}else if(score < 80) {
			str = "中";
		}else if(score < 90) {
			str = "良";
		}
		System.out.println(str);
	}
}
