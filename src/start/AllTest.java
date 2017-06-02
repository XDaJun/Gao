package start;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Scanner;

import org.hamcrest.SelfDescribing;
import org.junit.Test;

public class AllTest {
	//@Test
	public void isoscelestriangle() {
		for (int i = 1; i <= 5; i++) {
			for (int k = 5 - i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	@Test
	public void add(){
		int[] array = new int[] {23, 12, 3, 4, 55, 16};
		int temp=0 ;
		for (int i = 0; i < array.length-1; i++) {
			if (array[i]>array[i+1]) {
				temp=array[i];
			}else{
				temp=array[i+1];
			}
		}
		int[] array1=new int[6];
		System.arraycopy(array,	 0, array1, 0,6);
 		array1[6]= temp ;
 		array =array1;
 		System.out.println(array[array.length]);
	}
	//1、题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数
	public void test1(){
		System.out.println("请输入一串字符,我好统计一下");
		Scanner scanner =new Scanner(System.in);
		String theworld = scanner.nextLine();
		char[] charline = theworld.toCharArray();
		int chararcter =0;
		int digital =0;
		int blankcount=0;
		int othercount=0;
		
		for (int i = 0; i < theworld.length(); i++) {
			if((charline[i]>= 'a'&& charline[i]<='z') ||(charline[i] >='A' && charline[i]<='Z')){
				
			}
		}
	}
}
