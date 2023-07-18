package June_2.grooming;

public class ReverseRecursoin {

	public static void main(String[] args) {
		reverse(436);
	}
	public static void reverse(int n) {
		if(n<10) {
			System.out.print(n);
		}else {
			int rem = n%10;
			System.out.print(rem);
			n = n/10;
			reverse(n);
		}
	}
}
