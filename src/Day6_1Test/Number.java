/**
 * 定义名为Number的类，其中有两个整型数据成员num1和num2，应声明为私有。编写构造方法，赋予num1和num2初始值，再为该类定义加（add）、减（sub）、乘（multi）、除（div）等公有成员方法，分别对两个成员变量执行加、减、乘、除的运算。
在main方法中创建Number类的对象，调用各个方法，并显示计算结果。

 */

package Day6_1Test;

import java.util.Scanner;

public class Number {
	private  int  num1;
	private  int num2;
	public Number(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public Number() {
		super();
	}
	public int add(){
		return num1+num2;
	}
	public int sub(){
		return num1-num2;
	}
	public int mul(){
		return num1 *num2;
	}
	public int div(){
		return num1/num2;
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Number num =new Number(scanner.nextInt(),scanner.nextInt());
		System.out.println(num.add());
		System.out.println(num.sub());
		System.out.println(num.mul());
		System.out.println(num.div());
	}
}
