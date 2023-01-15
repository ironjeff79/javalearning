package Chapter13;
/*运行结果
 1时0分19秒
*/
/*为Time类定义构造方法以方便创建对象时初始化成员变量。
 再定义display方法用于将时间信息打印输出。
 
 为time类添加方法
 addSecond(int sec)
 addMinute(int min)
 addHour(int hou)
  
 */
public class Homework1312 {
	public static void main (String[] args) {
		Time t = new Time(14,35,55);
		t.addSecond(84);
		t.addMinute(23);
		t.addHour(10);
		t.display();		
		
	}

}

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time() {}
	public Time(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getHour() {
		return hour;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getMinute() {
		return minute;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getSecond() {
		return second;
	}
	public void display() {
		//System.out.println(this.hour + "时" + this.minute + "分" + this.second + "秒");
		System.out.println(this.getHour() + "时" + this.getMinute() + "分" + this.getSecond() + "秒");
	}
	public void addSecond(int sec) {
		int oldSec = this.getSecond();
		int newSec = oldSec + sec;
		for(int i=newSec; i>=60; i-=60) {
			this.setMinute (this.getMinute() + 1);
		}
		this.setSecond(newSec % 60);
		}
	public void addMinute(int min) {
		int oldMin = this.getMinute();
		int newMin = oldMin + min;
		for(int i=newMin; i>=60; i-=60) {
			this.setHour (this.getHour() + 1);
		}
		this.setMinute(newMin % 60);
		}
	public void addHour(int hou) {
		int oldHou = this.getHour();
		int newHou = oldHou + hou;
		for(int i=newHou; i>=24; i-=24) {
			//this.setHour (this.getHour() + 1);
		}
		this.setHour(newHou % 24);
		}
}
