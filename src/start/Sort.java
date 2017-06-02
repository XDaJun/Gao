package start;


import org.junit.Test;

/*
 * System.currentTimeMillis()  返回当前时间 毫秒为单位
 * p
 */

public class Sort {

	@Test
	public void bubble_sort() {
		System.out.println(System.currentTimeMillis());
		int[] array = { 3, 12, 3, 6, 4, 3, 3, 2, 34, 5, 6, 3, 4, 8, 6, 4, 3, 4, 5, 6, 7, 5, 6, 9, 3, 1, 3, 6, 8, 4 };
		// int[] arr={1,2,4,5};
		// 调用 二分法
		System.out.print(binaryChop(array, 34));
		System.out.println();
		// 打印数组中的数字
		function(array);
		System.out.println();

		System.out.println();
		System.out.println(System.currentTimeMillis());
	}

	// 冒泡排序方法
	public static int[] bubblesort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	// 选择排序方法
	public static int[] selectsort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	/**
	 * 二分查找
	 * @param array 要查找的数组
	 * @param num	要查找的元素
	 * @return  返回的下标
	 */
	// 二分查找方法
	public static int binaryChop(int[] array, int num) {
		selectsort(array);
		int high = array.length-1;
		int low = 0;
		int mid;
		for (;;) {
			mid = (high + low) / 2;
			if (array[mid] == num) {
				break;
			} else if (low>high) {
				mid = -1;
				break;
			} else if (array[mid] < num) {
				low = mid + 1;
			} else if (array[mid] > num) {
				high = mid - 1;
			}
		}
		return mid;
	}

	// 二分法查找 while循环版
	public static int whileBinaryChop(int[] array, int num) {
		int mid;
		int high=array.length-1;
		int low=0;
		mid=(low+high)/2;
		while(high>low){
			if(array[mid]>num){
				low=mid+1;
			}else if(array[mid]<num){
				high=mid-1;
			}else if (array[mid]==num){
				return mid;
			}
			mid=(low+high)/2;
		}
		return -1;
	}
	
	// 定义功能，用于打印数组中的元素。元素间用逗号隔开。
	public static void function(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != array.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	//数组的倒置
	public static void invarsion(int[] array){
		int low=0;
		int high=array.length -1;
		for(;low<high;){
			int temp=array[low];
			array[low]=array[high];
			array[high]=temp;
			low++;
			high--;
		}
	}

	//打印
	public static void print(int[] array){
		for(int i =0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
		
	
}
