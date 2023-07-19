package Exception1;

public class NullPointe {
	public static void main(String[]args) {
		System.out.println("Welcome");
	    String name=null;
		try {
		System.out.println(name.toUpperCase()); 
		}
		catch(ArithmeticException ae) {
			System.out.println("give correct input");
		}
		catch(NullPointerException ne) {
			//System.out.println(ne);
			ne.printStackTrace();
			//System.out.println("give correct name");
		}
		catch(NumberFormatException ne) {
			System.out.println("give correct number");
		}
		catch(Exception e) {
			System.out.println("Give correct input");
		}
		System.out.println("thank you");
		
	}

}
