package June_2.grooming;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("mb");
		test(4);
		System.out.println("me");
	}
	public static void test(int n) {
		System.out.println(n);
		n--;
		if(n>0) {
			test(n);
		}
		System.out.println(n);
	}

}
