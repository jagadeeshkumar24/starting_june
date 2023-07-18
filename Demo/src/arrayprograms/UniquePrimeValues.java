package arrayprograms;

public class UniquePrimeValues {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,4,3,5,6,2,1,1,7};
		int oc[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int c=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]){
					c++;
					oc[j]=1;
				}	
			}
			if(c>=1 && oc[i]!=1 && prime(a[i])) {
				System.out.println(a[i]);
			}
		}
	}
	public static boolean prime(int n) {
		int fc=1;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				fc++;
			}
		}
		return fc==2;
//		if(fc==2) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}
}
