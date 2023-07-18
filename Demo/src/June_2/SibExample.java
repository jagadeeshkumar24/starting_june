package June_2;

public class SibExample {
	static int i =20;
	static {
		System.out.println("from sib begins");
		main(null);
		SibExample.main(null);
		System.out.println(SibExample.i);
		int i = 30;
		SibExample.i= i;
		System.out.println(SibExample.i);
		System.out.println("sib ends");
	}
	public static void main(String[] args) {
		System.out.println("from main ");
	}

}
