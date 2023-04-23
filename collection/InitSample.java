package collection;
//运行结果 init
class Test1{
	Test1(){
		System.out.println("init");
	}
}

class Test2{
	Test2(String str){
		System.out.println("INIT");
	}

	public Test2() {
		// TODO Auto-generated constructor stub
	}
}

 class InitSample {
	 public static void main(String[] args) {
		 Test1 t1 = new Test1();
		 Test2 t2 = new Test2();
	 }

}
