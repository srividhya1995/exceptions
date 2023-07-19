package Exception1;

public class Indexoutof {
	public static void main(String[] args) {
		System.out.println("welcome");
		String a= "I,AM,A,JAVA,DEVELOPER";
		String[] b=a.split(",");
		try  {
		System.out.println(b[5]);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(NullPointerException np) {
			System.out.println(np);
		}
		catch(IndexOutOfBoundsException ie) {
			System.out.println(ie);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("thank you");
		
		String c="srividhya";
		System.out.println("Hello");
		try {
		System.out.println(c.charAt(14));
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			//ae.printStackTrace();
		}
		catch(NullPointerException np) {
			System.out.println(np);
		}
		catch(IndexOutOfBoundsException ie) {
			System.out.println(ie);
			//ie.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {//only it is possible after the try and catch method.
			System.out.println("hava a great day");
		}
		System.out.println("thanks");
}

}
