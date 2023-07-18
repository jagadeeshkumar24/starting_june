package ExceptionHandling;

public class UserClock {

	public static void main(String[] args) {
		Clock c1 = new Clock(11,34,56);
		c1.setHr(3);
		System.out.println(c1.getHr());
		c1.setMn(34);
		System.out.println(c1.getMn());
		c1.setSec(59);
		System.out.println(c1.getSec());
		
		
	}

}
