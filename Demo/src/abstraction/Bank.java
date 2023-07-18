package abstraction;


public class Bank  {
	private class sbi implements Atm{
		public void withdraw() {
			int i = 50000;
			System.out.println(i);
		}
		public void checkBals() {
			int b = 50;
			System.out.println(b);
		}
		
	}
	public Atm atm() {
		return new sbi();
	}
}
