package June_2.grooming;

public class PrimeNumbersBetween {

	public static void main(String[] args) {
		isprime(10,100);

	}
	public static void isprime(int m , int n) {
		
		for(int i=m;i<=n;i++) {
			int count =0;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count ==0) {
				System.out.println(i+" is prime number " );
			}
		}
	}

}
