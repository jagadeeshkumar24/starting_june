package June_2.normalPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		//int n = 13;
		for(int n=10;n<=100;n++) {
			int count =0;
			for(int i=2;i<= n/2;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(n+"	is prime");
			}
		}
		
	}

}
