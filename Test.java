package Exception1;

public class Test {
	public static void main(String[]args) {
		System.out.println("welcome");
		int a=10;
		int b=5;
		int c=0;
		System.out.println(a+b+c);
		try {
		System.out.println(a/c);//without using try and catch it causes exception to handle this we use try and catch .
		}
		catch(Exception e) {  // we don't know what type of exceptin 
			System.out.println("Don't divide any number by zero");
		}
		System.out.println(a*b);
		System.out.println("Thank You");
	}
	

}
