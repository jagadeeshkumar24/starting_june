package June_2;

public class Prime {
	public static void main(String[] args) {
		prime();
		
	}
	public static void prime() {
		for(int n=2;n<=30;n++) {
			 int count =0;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0)
					count++;
			}
			if(count==0) {
				System.out.println(n+"	is prime number");
			}
		}
		
			
	}

}
