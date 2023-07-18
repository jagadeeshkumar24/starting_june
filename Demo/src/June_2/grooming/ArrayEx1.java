package June_2.grooming;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] a = {3,5,6,4,3};
		int []b = new int[a.length];
		b=a;
		//b[0]++;
		System.out.println("print first array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nprint second array");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
//		System.out.println(b[j]);
	}
}
