package arrayprograms;

public class Sort1 {

	public static void main(String[] args) {
		int a[] = {4,5,6,9,-8,2,4,7};
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length-i;j++){
				if(a[j-1] > a[j]) {
					int temp = a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		
		
	}

}
