package Four;

import java.util.Scanner;

import org.junit.Test;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年吗");
		}
	}

	public void get() {
		Scanner s = new Scanner(System.in);
	}

	public void bubbleSort() {
		int[] bu = { 7, 4, 2, 5, 6, 3 };
		for (int i = 0; i < bu.length; i++) {
			for (int j = 0; j < 5 - i; j++) {
				if (bu[j + 1] < bu[j]) {
					int temp = bu[j];
					bu[j] = bu[j + 1];
					bu[j + 1] = temp;
				}
			}
		}
		for (int k = 0; k < bu.length; k++) {
			System.out.println(bu[k]);
		}
	}

	public void selectSort() {
		int[] se = { 3, 7, 8, 4, 7, 3 };
		for (int i = 0; i < se.length; i++) {
			for (int j = i; j < se.length; j++) {
				if (se[i] > se[j]) {
					int temp = se[i];
					se[i] = se[j];
					se[j] = temp;
				}
			}
		}
		for (int k = 0; k < se.length; k++) {
			System.out.println(se[k]);
		}
	}

	public void colorBall() {
		int blueball;
		int redball[] = new int[6];
		blueball = (int) (Math.random() * 16 + 1);
		for (int i = 0; i < 6; i++) {
			int red = (int) (Math.random() * 7 + 1);
			redball[i] = red;
			for (int j = 0; j < i; j++) { // 第一遍j=0 i=0 不执行循环里
				if (redball[j] != red) {
					redball[i] = red;
				} else {
					i--;
					break;
				}
			}

		}
		System.out.println("篮球为" + blueball);
		System.out.println("红球为");
		for (int k = 0; k < 6; k++) {
			System.out.print(redball[k] + "\t");
		}
	}

	

	public void result() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成绩");
		int score = scanner.nextInt();
		if (score > 100 || score < 0) {
			System.out.println("输入错误，请重新输入。");
		} else if (score >= 90) {
			System.out.println("a");
		} else if (score < 90 && score >= 80) {
			System.out.println("b");
		} else if (score < 80 && score >= 70) {
			System.out.println("c");
		} else if (score < 70 && score >= 60) {
			System.out.println("d");
		} else {
			System.out.println("go home look your mom and tell her");
		}
	}

	public void yy() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public void multiple() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				sum++;
			}
		}
		System.out.println(sum);
	}

	public void graph() {
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void multiplicationTable() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

	public void mouth() {
		int y;
		int m;
		System.out.println("请输入年份：");
		Scanner scanner = new Scanner(System.in);
		y = scanner.nextInt();
		System.out.println("请输入月份：");
		Scanner scanner2 = new Scanner(System.in);
		m = scanner2.nextInt();
		int s = 0;
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			s++;
		}
		if (m == 1) {
			System.out.println(31);
		} else if (m == 2) {
			System.out.println(28 + s);
		} else if (m == 3) {
			System.out.println(31);
		} else if (m == 4) {
			System.out.println(30);
		} else if (m == 5) {
			System.out.println(31);
		} else if (m == 6) {
			System.out.println(30);
		} else if (m == 7) {
			System.out.println(31);
		} else if (m == 8) {
			System.out.println(31);
		} else if (m == 9) {
			System.out.println(30);
		} else if (m == 10) {
			System.out.println(31);
		} else if (m == 11) {
			System.out.println(30);
		} else if (m == 12) {
			System.out.println(31);
		} else {
			System.out.println("输入错误");
		}
	}

	public void month2() {
		int year;
		int month;
		System.out.println("請輸入年份");
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		if (year<0) {
			System.out.println("年份错误");
		}
		System.out.println("请输入月份");
		Scanner scanner2 = new Scanner(System.in);
		month = scanner2.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(31);
			break;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(29);
			} else {
				System.out.println(28);
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(30);
			break;
		default:
			System.out.println("输入错误");
			break;
		}
	}

	/**
	 * 函数
	 * 
	 */
 	public int max( int num1, int num2){
		if(num1>num2){
			return num1;
		}else{
			return num2;
		}
	}
	
	
	public void zz(){
		int num =3;
		int mun =4;
		int tt =max(num,mun);
		System.out.println(tt);
	}
	

	
	public void arrary(){
		int[] arrary =new int[5];
//		arrary[arrary.length-1] =3;
		int[] arrary1={ 1,2,3,5,3,44};
//		for(int i = 0 ;i<arrary1.length;i++){
//			System.out.println(arrary1[i]);
//			
//		}
//		for (int i = arrary1.length-1; i >=0; i--) {
//			System.out.print(arrary1[i]+"   ");
//			
//		}
		int tt=max(arrary1);
		System.out.println(tt);	
	}

	public int sum(int[] array ){
		int sum= 0;
		for (int i =0;i<array.length;i++){
			sum=sum+array[i];
		}
		return sum;
	}

	
	public int max(int[] array){
		int max = 0;
		for(int i =0 ; i< array.length-1;i++){
			if(array[i]<array[i+1]){
				max=array[i+1];
			}else{
				max=array[i];
			}
		}
		return max;
		
	}

	public void triangle(){
		for(int i = 1 ; i<5;i++){
			for(int j = 0 ; j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Test
	public void getscore() {
		int[] score = new int[5];
		int sum = 0;
		double avg;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			score[i] = scanner.nextInt();
			sum = sum + score[i];
		}
		avg = (double) sum / (double) score.length;
		System.out.println(avg);
	}
}
