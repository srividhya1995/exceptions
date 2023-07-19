package Exception1;

import java.util.ArrayList;

public class Car {
String brand;
String model;
int price;
String color;
int enginecc;


/*public void getIntput() {
	System.out.println("enter brand name= ");
	System.out.println("enter  model= ");
	System.out.println("enter price= ");
	System.out.println("enter enginecc= ");
	System.out.println("enter color= ");
}*/
public Car(String brand,String model,int price,int enginecc,String color ) {
	this.brand=brand;
	this.model=model;
	this.price=price;
	this.enginecc=enginecc;
	this.color=color;
}
/*public class Val {
	int n=5;
	public void addValues(String brand[],String model[],int price[],int enginecc[],String color[]) {
	ArrayList<Car>cars=new ArrayList<>();
	for(int i=0;i<n;i++) {
		cars.add(new Car(brand[i],model[i],price[i],enginecc[i],color[i]));
		printVal(cars);
	}
	}
	public void printVal(ArrayList<Car>cars) {
		for(int i=0;i<n;i++) {
			Car car=cars.get(i);
			System.out.println(car.brand+" "+car.model+""+car.price+""+car.enginecc+""+car.color);
			}
	}
	}
	
	private void printVal(ArrayList<Car> cars) {
		// TODO Auto-generated method stub*/
		
	//}

public int getColor(int price,String color) {
	int a=price;
	if(color.equalsIgnoreCase("white")) {
		return a=a+1000;
	}
	return a;
	
	
	}
}


