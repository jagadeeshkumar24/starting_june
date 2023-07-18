package methodoverriding;

public class Bank {
	int getrateOfInterest() {
		return 0;
	}
}
class Sbi extends Bank {
	int getrateOfInterest() {
		return 8;
	}
}
class Icci extends Bank {
	int getrateOfInterest() {
		return 7;
	}
}
class Kotak extends Bank {
	int getrateOfInterest() {
		return 6;
	}
}

class Test{
	public static void main(String[] args) {
		Sbi s=new Sbi();
		Icci i = new Icci();
		Kotak k = new Kotak();
		System.out.println("sbi interest of :"+s.getrateOfInterest());
		System.out.println("sbi interest of :"+i.getrateOfInterest());
		System.out.println("sbi interest of :"+k.getrateOfInterest());
	}
}