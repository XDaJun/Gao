/**
 * 写一个类加法类Add：主要是实现加法的操作，可以实现整数int相加、double类型的相加、long类型的相加、float类型的相加。
 */
package Day6_1Test;

public class Add {
	public int add(int[] array) {
		int num=0;
		for(int i=0;i<array.length;i++){
			num=num+array[i];
		}
		return num;
	}
	public double add(Double[] array) {
		double num=0;
		for(int i=0;i<array.length;i++){
			num=num+array[i];
		}
		return num;
	}
	public long add(long[] array) {
		long num=0;
		for(int i=0;i<array.length;i++){
			num=num+array[i];
		}
		return num;
	}
	public float add(float[] array) {
		float num=0;
		for(int i=0;i<array.length;i++){
			num=num+array[i];
		}
		return num;
	}
}
