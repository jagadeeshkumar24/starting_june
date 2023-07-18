package June_2.grooming;

public class LargestArray {
	static int a[]= {45,6,7,24,67,46};
	static int largest() {
		int max =a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println("largest array: "+largest());
	}
}
