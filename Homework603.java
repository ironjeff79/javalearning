package aa;
/*题目：
1. 系统接收一个学生的考试成绩，根据考试成绩输出成绩的等级
2. 等级：
     优：【90-100】
     良：【80-90】
     中：【70-80】
     及格：【60-70】
     不及格：【0-60】
3. 要求成绩是一个合法的数字，成绩必须在【0-100】之间，可以带有小数点

	
*/
public class Homework603 {
	public static void main(String[] args) {
		//提示用户输入学生成绩
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入学生成绩：");
		double score = s.nextDouble();
		if(score < 0 || score > 100) {
			System.out.print("成绩不合法，再见！");
			return;
		}
		int grade = (int)(score / 10);
		String str = "不及格";
		switch (grade) {
		case 10: case 9:
			str = "优";
			break;
		case 8:
			str = "良";
			break;
		case 7:
			str = "中";
			break;	
		case 6:
			str = "及格";	
		}
		System.out.print("该学生成绩为：" + str);
	}

}
