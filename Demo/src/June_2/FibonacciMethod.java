package June_2;

public class FibonacciMethod {

	public static void main(String[] args) {
		fibonacci(10,20);

	}
	public static void fibonacci(int a,int b) {
		int count =0;
		System.out.println(a);
		System.out.println(b);
		while(true) {
			int c = a+b;
			System.out.println(c);
			count++;
			if(count==5) {
				break;
			}
			a=b;
			b=c;
		}
	}

}
