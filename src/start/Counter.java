/*
 * 
 * 
 * 
 */
package start;

import java.util.Scanner;

import org.junit.Test;

public class Counter {
	/*
	 * 收银台程序
	 * 能确定收多少钱 找零 打折功能  用if判断 去除
	 * Scanner 获取数据 nextdouble 转换为double类型
	 * 错误分为两种情况 》500时的错误  和  《500时的错误
	 * 先判断错误 在计算
	 */

	public void conter(){
		double thing;
		double money;
		Scanner scanner1 =new Scanner(System.in);
		thing= scanner1.nextDouble();
		System.out.println("应收"+thing+"元");
		Scanner scanner =new Scanner(System.in);
		money=scanner.nextDouble();
		double backmoney;
		//钱不够分为两种情况
		if(thing<500){
			backmoney=money-thing;
			if(backmoney<0){
				System.out.println("继续掏 掏不出来走不了。");
				return;
			}else {
				System.out.println("实收"+money+"找零"+backmoney+"    谢谢惠顾");
			}
		}
		if(thing>=500){
			backmoney=money-thing*0.8;
			System.out.println("享受8折优惠"+"应收"+thing*0.8);
			if(backmoney<0){
				System.out.println("继续掏 掏不出来走不了。");
				return;
			}else {
				System.out.println("实收"+money+"找零"+backmoney+"    谢谢惠顾");
			}
		}
	}

	
	public void whileloop(){
		int i =0;
		while(i<5){
			System.out.println("yuyu");
			i++;
		}
	}
	//判断输入一个数的大小
	
	public void Random(){
		int ran =(int)(Math.random()*1000+1);
		System.out.println("请输入1到1000的数字");
		Scanner scanner =new Scanner(System.in);
		int inport =scanner.nextInt();
		//错误检查
		if(inport>1000||inport<0){
			System.out.println("请输入1到1000的数字");
			return;
		}
		
		if(inport>ran){
			System.out.println("大了");
		}else if(inport<ran){
			System.out.println("小了");
		}else{

			
			System.out.println("正好");
		}
	}
	//一道一百以内7的倍数
	//统计 计数
	
	public void multiple(){
		int sum =0;
		for(int i =1;i<=100;i++){
			if(i%7==0){
				System.out.print(i+" ");
				sum++;
			}
		}
		System.out.println();
		System.out.println("一共有"+sum+"个");
	}
	
	/**
	 *  u
	 *  uu
	 *  uuu
	 *  uuuu
	 *  uuuuu
	 */
	
	public void triangle(){
		for(int i =1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	
	//年分和月份对应
	
	public void yearmonth(){
		int year;
		int month;
		System.out.println("请输入年份：");
		Scanner scanner=new Scanner(System.in);
		year = scanner.nextInt();
		System.out.println("请输入月份：");
		Scanner scanner1= new Scanner(System.in);
		month=scanner1.nextInt();
		if(month>12||month<0||year<0){
			System.out.println("月份输入错误！！！！");
			return;
		}
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		case 2:
			if((year%4==0&&year%100!=0)||year%400==0){
				System.out.println("28天");
			}else{
				System.out.println("29天");
			}
			break;
		}
	}
	
	public void chengji(){
		int cj;
		Scanner scanner=new Scanner(System.in);
		cj=scanner.nextInt();
		int cj1=cj/10;
		switch(cj1){
		case 10 :
		case  9:
			System.out.println("A");
			break;
		case  8:
			System.out.println("B");
			break;
		case  7:
			System.out.println("C");
			break;
		case  6:
			System.out.println("D");
			break;
		default:
			System.out.println("f");
			break;
		}
	}
	
	public  static int sum(int[] values){
		int sum=0;
		for(int i = 0;i<values.length;i++){
			sum=values[i] + sum;
		}
		return sum;
		
	}
	
	
	public  void test(){
		int array[]={1,2,3,4,5};
		System.out.println( sum (array) );
	}
	
	/*
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 */
	public void test1(){
		for(int i =1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	@Test
	public void test3(){
		int [] sore={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		for(int i=0;i<=9;i++){
			int count=0;
			for(int j=0;j<sore.length;j++){
				if(i==sore[j]){
					count++;
				}
			}
			System.out.println(i+"为"+count);
		}
	}
	
	
	//简便算法版
	public void test7(){
		int [] sore={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int[] count =new int[10];
		for(int i=0;i<sore.length;i++){
			switch(sore[i]){
			case 0:
				count[0]++;
				break;
			case 1:
				count[1]++;
				break;
			case 2:
				count[2]++;
				break;
			case 3:
				count[3]++;
				break;
			case 4:
				count[4]++;
				break;
			case 5:
				count[5]++;
				break;
			case 6:
				count[6]++;
				break;
			case 7:
				count[7]++;
				break;
			case 8:
				count[8]++;
				break;
			case 9:
				count[9]++;
				break;
			default:
				break;
			}
		}
	}
	
	public void test4(){
		int [] sore={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int sum=0;
		for(int i=0;i<sore.length;i++){
			if(sore[i]%2==0){
				sum++;
			}
		}
		System.out.println("偶数为"+sum);
		System.out.println("奇数为"+(sore.length-sum));
	}
	
	@Test
	public void test5(){
		System.out.println("请输入学生个数：");
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		System.out.println("请依次输入学生成绩。");
		double sum=0;
		for(int i=1;i<=count;i++){
			sum=sum+scanner.nextDouble();
		}
		System.out.println("学生平均成绩为"+sum/count);
	}
	
	//数组版
	public void test6() {
		System.out.println("请输入学生个数");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int[] array = new int[count];
		System.out.println("请依次输入学生成绩");
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
			sum = sum + array[i];
		}
		System.out.println("平均数为" + sum / count);
	}
	
	public void damo(){
		System.out.println();
	}
}
