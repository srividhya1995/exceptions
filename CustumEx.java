package Exception1;

public class CustumEx {
	public static void main(String[] args) throws AgeException {
		String name=args[0];
		System.out.println(name);
		int age=Integer.parseInt(args[1]);
		if(age>=18) {
			System.out.println("Valid Age"); 
		}
			else {
				throw new AgeException("Invalid Age");
		}
			String gender=args[2];
			System.out.println(gender);
		}
		
	}
	


