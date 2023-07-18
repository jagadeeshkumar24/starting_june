package Objectclass;

public class EqualsConcept {

	public static void main(String[] args) {
		Car2 car=new Car2("tata",150.3);
		Car2 car1=new Car2("tata",150.3);
		System.out.println(car.equals(car1));
		System.out.println(car1.equals(car));
	}

}
