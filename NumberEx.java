package Exception1;

public class NumberEx {
	public static void main(String[]args) {
		System.out.println("welcome");
		try {
		String a="Tn6078";
		int b=Integer.parseInt(a); 
		System.out.println(b);
		}
		catch(ArithmeticException ae) {
			System.out.println("give correct input");
		}
		catch(NullPointerException ne) {
			System.out.println(ne);
		}
		catch(NumberFormatException ne)  {
			System.out.println(ne);
		}
	System.out.println("thank You");
		}
	}

