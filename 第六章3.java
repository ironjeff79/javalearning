package aa;
//while do..while      转向语句45行
/* while循环：
   1 语法机制
        while(布尔表达式){
            循环体;
        }
   2 执行原理
     判断布尔表达式的结果，如果为true就执行循环体，循环体结束之后，再次判断布尔表达式的结果，
     如果还是true，继续执行循环体，直到布尔表达式结果为false，while循环结束。
   3 循环次数 0-N
   
 if switch属于分支语句属于选择语句
 for while do..while..属于循环语句 可以正常嵌套     



do..while.. 循环语句的执行原理以及语法机制：
语法机制：
do{
   循环体;
   }while();
对于do..while循环来说，循环体至少执行1次。
对于while来说，执行次数是0-N次。
   
   

*/
public class 第六章3 {
	public static void main(String[] args) {
		int i = 0;                   //结果是0-9
		do {
			System.out.println(i);
			i++;			
		}while(i < 10);
		
		int s = 0;
		do {
			System.out.println(++s);	//结果是1-10		
		}while(s < 10);
	
	
	
	
/*转向语句
 break;
 continue;
 return;
 
 break语句和continue语句比较特殊，是一个单词称为一个完整的java语句
 可以用break的两个地方
  1. 可以用来终止switch语句的执行
  2. 用在循环语句当中，用来终止循环的执行（for while do..while..）	
      如何终止指定的循环？
       第一步：你需要给循环起一个名字，例如：
        a: for(){
           b：for(){
           }
        }
 	
*/
		for(int a = 0; a < 10; a++) {
			if(a == 5) {
				break; //会让离他最近的循环终止（不是针对if，而是针对for循环）
			}
			System.out.println("a = " + a);
		}
	
/*continue语句
	终止当前“本次循环”，直接进入下一次循环执行 


	
	
*/
		for(int a = 0; a < 10; a++) {
			if(a == 5) {
				continue; //会让离他最近的循环终止（不是针对if，而是针对for循环）
			}
			System.out.println("i = " + a);   // 0 1 2 3 4 6 7 8 9
		}
	
	
	
	
	
	
	
	
	
	}

}
