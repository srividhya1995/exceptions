package Exception1;
import java.util.ArrayList;
import java.util.Scanner;
public class UseCar {
	public static void main(String[] args)throws EngineException {
		Scanner s=new Scanner(System.in);
		System.out.println("brand= ");
		String b=s.next();
		System.out.println("model= ");
		String m=s.next();
		System.out.println("price= ");
		int p=s.nextInt();
		System.out.println("color= ");
		String co=s.next();
		System.out.println("enginecc= ");
		int ec=s.nextInt();
		
		Scanner s1=new Scanner(System.in);
		System.out.println("brand= ");
		String b1=s1.next();
		System.out.println("model= ");
		String m1=s1.next();
		System.out.println("price= ");
		int p1=s1.nextInt();
		System.out.println("color= ");
		String co1=s1.next();
		System.out.println("enginecc= ");
		int ec1=s1.nextInt();
		
		Car c1=new Car(b,m,p,ec,co);
		/*c1.brand=b;
		c1.model=m;
		c1.price=p;
		c1.enginecc=ec;
		c1.color=co;*/
		Car c2=new Car(b1,m1,p1,ec1,co1);
		/*c2.brand=b1;
		c2.model=m1;
		c2.price=p1;
		c2.enginecc=ec1;
		c2.color=co1;*/
		ArrayList<Car>car=new ArrayList<>();
		car.add(c1);
		car.add(c2);
		System.out.println(car);
		System.out.println(c1.getColor(p,co));
		System.out.println(c1.getColor(p1, co1));
		try {
		System.out.println(c1.brand.charAt(76));
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(IndexOutOfBoundsException ie) {
			System.out.println(ie);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
		System.out.println("Check the operation");
		}
		System.out.println(c2.model.toUpperCase());
		if(c1.enginecc<54) {
			throw new EngineException("low grade");
		}
		else
			System.out.println("normal");
	
	System.out.println("thank You");
	}
	
}
		
		
		
	



