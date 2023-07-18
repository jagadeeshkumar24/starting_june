package abstraction;

public class Sample {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Atm obj = bank.atm();
		obj.withdraw();
		obj.checkBals();
	}
		
}
