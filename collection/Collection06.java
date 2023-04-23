package collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
/*
运行结果
1
2
3
ab
def
xyz
0

关于集合元素的remove
    重点1：当集合的结构发生改变时，迭代器必须重新获取。
    如果还是用以前老的迭代器，会出现异常：java.util.ConcurrentModificationException
    
    重点2：在迭代集合元素的过程中，不能调用集合对象的remove方法，删除元素:
    c.remove(o);迭代过程中不能这样
    会出现异常：java.util.ConcurrentModificationException
    
    重点3：在迭代元素的过程当中，一定要使用迭代器Iterator的remove方法，删除元素
    不要使用集合自带的remove方法删除元素
    
 
*/
public class Collection06 {
	public static void main(String[] args) {
		//创建集合
		Collection c = new ArrayList();
		
		/*注意: 此时获取的迭代器，指向的是集合中没有元素状态下的迭代器。
		        集合结构只要发生改变，迭代器必须重新获取。      
		        当集合结构发生了改变，迭代器没有重新获取时，此时调用next()方法会： java.util.ConcurrentModificationException 
		Iterator it = c.iterator();
		*/
		//添加元素
		c.add(1);
		c.add(2);
		c.add(3);
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			//编写代码时next()方法返回值类型必须是Object
			Object obj = it.next();
			System.out.println(obj);
		}
		
		Collection c2 = new ArrayList();
		c2.add("ab");
		c2.add("def");
		c2.add("xyz");
		
		Iterator it2 = c2.iterator();
		while(it2.hasNext()) {
			Object o = it2.next();
			/*删除元素
			  删除元素之后，集合的结构发生了变化，应该重新去获取迭代器
			  但是，循环下一次的时候并没有从新获取迭代器，所以会出现异常。
			*/
			//出异常根本原因是：集合中元素删除了，但是没有更新迭代器（迭代器不知道集合变化了）
			//c2.remove(o); 直接通过集合去删除元素，没有通知迭代器。（导致迭代器的快照和原集合状态不同）
			//使用迭代器来删除可以吗?
			//迭代器去删除时，会自动更新迭代器，并且更新集合（删除集合中的元素）。
			it2.remove();  //删除的一定是迭代器指向的当前元素
			System.out.println(o);		
		}
		System.out.println(c2.size());		
	}
}
