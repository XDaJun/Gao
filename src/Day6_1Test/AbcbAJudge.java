/**
 * 判断一个回文数
 * 
 */
package Day6_1Test;



public class AbcbAJudge {
	public static void main(String[] args) {
		int[] array1={1,2,3,4,3,2,1};
		int[] array2={1,2,3,3,2,1};
		if( abcbaJudge(array1)){
			System.out.println("是回文数");
		}else{
			System.out.println("不是回文数");
		}
		if( abcbaJudge(array2)){
			System.out.println("是回文数");
		}else{
			System.out.println("不是回文数");
		}
	}
	public static boolean abcbaJudge(int[] array){
		for(int i=0;i<array.length/2;i++){
			if(array[i]!=array[array.length-i-1]){
				return false;
			}
		}
		return true;
	}
	
}
