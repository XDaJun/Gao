package IHaveACar;

public class Car {
	String CarName;
	double gass;
	char whole;
	float price;
	String colour;
	double distance;
	public void start(){
		System.out.println(CarName+" is running");
		gass = gass-2;
	}
	public void ruing(){
		System.out.println("weng  weng weng");
		gass= gass-50;
	}
	public void stop(){
		System.out.println("the car is stop,please check gass!");
		System.out.println("good lucky!");
	}
	public void warn(){
		if(gass<10){
		System.out.println(CarName+"is out of gas,go station.");
		}
	}
	public void show(){
		System.out.println(CarName+"\t"+price+"\t"+colour);
	}
}
