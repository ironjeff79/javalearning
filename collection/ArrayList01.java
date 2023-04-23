package collection;

import java.util.List;
import java.util.ArrayList;
/*
运行结果
0
10

ArrayList集合：
    1. 默认初始化容量10  (底层先创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量10)
    2. 集合底层是一个Object[]数组。
    3. 构造方法
       new ArrayList();
       new ArrayList(100);
    4. ArrayList集合的扩容：
       原容量的1.5倍 
       ArrayList集合底层是数组，怎么优化？
            尽可能少的扩容。因为数组扩容效率比较低，建议在使用ArrayList集合的时候预估计元素的个数，给定一个初始化容量。
    5. ArrayList集合        
*/
public class ArrayList01 {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		//集合的size()方法是获取当前集合中元素的个数。
		System.out.println(list1.size());  //0
		
		//指定初始化容量 
		List list2 = new ArrayList(20);
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		System.out.println(list1.size()); 
		
		list1.add(11);
		
	}

}
