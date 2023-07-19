package Exception1;
import java.util.Scanner;
import java.util.*;
public class UseBike {
public static void main(String[] args) {
	int n=2;
	ArrayList<String>brands=new ArrayList<>();
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER BRAND NAME : ");
	for(int i=0;i<=n;i++) {
	String b=s.nextLine();
	Bike bike1=new Bike(b);
	brands.add(b);
	System.out.println(brands);
}
}
}
