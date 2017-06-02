package IHaveACar;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Car car = new Car();
		car.CarName = "LEXUS";
		car.gass = 189;
		car.whole = 4;
		System.out.println("请输入路程");
		Scanner s = new Scanner(System.in);
		car.distance = s.nextInt();
		car.start();
		for (int i = 0; i < car.distance; i++) {
			car.ruing();
			if (car.gass < 10) {
				System.out.println(car.CarName + "is out of gas,distance is " + i + "  go station.");
				break;
			}
		}
		Car car1 = new Car();
		car1.CarName = "TOYOTA";
		car1.colour = "black";
		car1.price = 1000000000;
		car1.gass = 178;
		car1.start();
		car1.show();

	}
}
