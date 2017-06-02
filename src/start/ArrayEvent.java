package start;
 
import java.util.Scanner;

/**
 * 一些对数组的操作
 * 
 * @author Corleone 1、冒泡排序 2、选择排序 3、二分法查找 4、打印数组 5、数组的倒置 6、选出数组中最大的 插入到数组后一位
 *7、输入一个数组  8、随机生成一个数组
 */
public class ArrayEvent {
	public static void main(String[] args) {

		System.out.println(System.currentTimeMillis());
		int[] array= buildArray();
		bubbleSort(array);
		printArray(array);
		System.out.println();
		invarsion(array);
		printArray(array);
		System.out.println();
		System.out.println(binarySelect(array, 21));
		System.out.println(System.currentTimeMillis());
	}

	// 冒泡排序
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp;
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	// 选择排序
	public static void selectSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[i] < array[j]) {
					int temp;
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}

	// 二分查找
	public static int binarySelect(int[] array, int aim) {
		int index;
		int low = 0;
		int high = array.length - 1;
		while (high >= low) {
			index = (low + high) / 2;
			if (array[index] == aim) {
				return index;
			} else if (array[index] > aim) {
				low = index + 1;
			} else if (array[index] < aim) {
				high = index - 1;
			}
		}
		return -1;
	}

	// 打印数组 [x,x,x,x]
	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

	// 数组倒置
	public static void invarsion(int[] array) {
		int middle = array.length / 2;
		for (int i = 0; i < middle; i++) {
			int temp;
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
	}
	//输入一个数组
	public static int[] buildArray() {
		System.out.println("请输入生成数组的长度");
		Scanner scanner =new Scanner(System.in);
		int length =scanner.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入");
			array[i]=scanner.nextInt();
		}
		return array;
	}
	//随机生成一个数组
	//数组长度为1-20
	//元素大小为1-100
	public static int[] randomArray(){
		int length =(int)Math.random()*20+1;
		int[] array= new int[length];
		for (int i = 0; i < array.length; i++) {
			 array[i]=(int)Math.random()*100+1;
		}
		return array;
	} 
}
