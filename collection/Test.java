package collection;
//运行结果 82
class Test {
	int test = 81;
	
	public static void main(String[] argd) {
		new Test().go();

	}
	
	
	void go () {
		incr(++test);
		System.out.println(test);
		
	}
	
	void incr(int test) {
		test += 10;
		//this.test += 10;  //92
	}
}