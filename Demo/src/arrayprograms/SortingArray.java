package arrayprograms;

public class SortingArray {
	public static void main(String[] args) {
		int a[]= {3,4,6,8,9,-1};
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					int temp =a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i : a) {
			System.out.println(i);
		}
	}
}
