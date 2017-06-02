/**
 * 属性：速度(speed)，体积(size)等等
方法：移动(move())，加速speedUp(),减速speedDown()等等.
最后在测试类VehicleTest中的main()中实例化一个交通工具对象，并通过方法给它初始化speed,size的值，并且通过get方法打印出来。另外，调用加速，减速的方法对速度进行改变（改变speed的值），改变后的速度值在main()方法中打印出来。

 */
package Day6_1Test;		

public class Vehicle {
	protected int speed;
	protected int size;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int speed, int size) {
		super();
		this.speed = speed;
		this.size = size;
	}
	public void get() {
		System.out.println("汽车速度为"+speed+"汽车体积为"+size);
	}
	public void getSpeed() {
		System.out.print("速度"+speed);
	}
	public void move() {
		System.out.println("汽车启动了，嗡嗡嗡，嗡嗡嗡");
		getSpeed();
	}
	public void speedUp() {
		System.out.println("汽车加速了，嗡嗡嗡嗡");
		speed=speed+10;
		getSpeed();
	}
	public void speedDown() {
		System.out.println("汽车减速了，嗡嗡");
		speed=speed-10;
		getSpeed();
	}	
}
