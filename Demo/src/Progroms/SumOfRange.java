package Progroms;

public class SumOfRange {

	public static void main(String[] args) {
		int n1=1;
		int n2=10;
//		int sum=0;
//		for(int i=n1;i<=n2;i++) {
//			sum=sum+i;
//			
//		}
//		System.out.println(sum);
//		int sum=((n2*(n2+1)/2)-(n1*(n1+1)/2)+n1 );
//		System.out.println("sum of numbers  "+sum);
		int sum=getsum(0,n1,n2);
		System.out.println("the sum is "+sum);
	}
	public static int getsum(int sum,int n1,int n2) {
		if(n1>n2)
			return sum;
		return n1 + getsum(sum,n1 + 1,n2);
	}

}
