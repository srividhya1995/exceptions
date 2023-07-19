package Exception1;

public class Facebook { 
	public static void main(String[] args) throws LoginException  {
	String name="srividhya";
	String password="sri1995.";
	if(name=="srividhya" && password=="sri1995") {
		System.out.println("login");  }
		else {
			throw new LoginException("Either name or password is incorrect");
		}
	}

}
