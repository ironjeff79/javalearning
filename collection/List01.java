package collection;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

/*
运行结果
A
E
B
C
D
A
B
AEBCDA 
0
5
AEBFDA

测试List接口中常用方法
    1. List集合存储元素特点：有序可重复
        有序：List集合中的元素有下标
        从0开始，以1递增
        可重复：存储一个1，还可以再存储1
    
    2. List既然是Colleection接口的子接口，那么肯定List接口有自己“特色”的方法  
        以下只列出List接口特有的常用方法：E是泛型，目前可以当作Object来看
            void add(int index, E element)
            E get(int index)
            int indexOf(Object o)
            int lastIndexOf(Object o)
            E remove(int index)
            E set(int index, E element)
              
*/
public class List01 {
	public static void main(String[] args) {
		//创建List类型的集合
		List list = new LinkedList();

		//添加元素
		list.add("A"); //默认都是向列表的尾部添加指定的元素
		list.add("B");
		list.add("C");
		list.add("D");
		list.add(1, "E");  //在列表的指定位置插入指定元素（第一个参数是下标）
		list.add("A");
		
		//迭代
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		//根据下标获取元素
		System.out.println(list.get(2));
		
		//因为有下标，所以List集合有自己比较特殊的遍历方式
		//通过下标遍历
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println(" ");
		
		//获取指定对象第一次出现处的索引
		System.out.println(list.indexOf("A"));
		System.out.println(list.lastIndexOf("A"));
		
		//修改指定位置的元素
		list.set(3, "F");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}		
	}
}



