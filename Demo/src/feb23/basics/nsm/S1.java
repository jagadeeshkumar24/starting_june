package feb23.basics.nsm;

public class S1 {
	int a =10;
	static int b = 20;
	
	public static void main(String[] args) {
		S1 s = new  S1();
		System.out.println(s.a);
	}
	static {
		System.out.println("sib works");
	}
	{
		System.out.println("iib works");
		System.out.println(a);
	}
	
	
	
	
	

}

