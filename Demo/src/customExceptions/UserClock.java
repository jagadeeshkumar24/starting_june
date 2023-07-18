package customExceptions;

public class UserClock {

	public static void main(String[] args) {
		Clock c1 =new Clock(3,45,50);
		c1.setHr(10);
		System.out.print(c1.getHr()+":");
		c1.setMn(20);
		System.out.print(c1.getMn()+":");
		c1.setSc(20);
		System.out.print(c1.getMn()+":");
	}

}
