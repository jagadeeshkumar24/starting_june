package Progroms;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum+"sum of natural numbers");
		//another way use formula n*(n+1)/2
		System.out.println((n*(n+1)/2)+" sum of natural numbers");
		
	}

}
