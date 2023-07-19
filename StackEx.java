package Exception1;

public class StackEx {
	public void test1() {
		test2();
	}
	public void test2() {
		test1();
	}
	public static void main(String[] args) {
		StackEx se=new StackEx();
		se.test1();
		//se.test2();
	}

}
