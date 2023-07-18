package June_2;

public class MethodWithFormalArguments {

	public static void main(String[] args) {
		factorial(10);

	}
	public static void factorial(int n ) {
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(fact+"factorial of number");
	}

}
