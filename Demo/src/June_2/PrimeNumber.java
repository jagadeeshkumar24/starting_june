package June_2;

public class PrimeNumber {

	public static void main(String[] args) {
		for(int n=2;n<=500;n++) {
			int  count=0;
			for(int j=2;j<=n/2;j++) {
				if(n%j==0)
					count++;
			}
			if(count==0) {
				System.out.println(n+" is prime number");
			}
		}
		
	}

}
