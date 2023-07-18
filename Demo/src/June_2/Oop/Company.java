package June_2.Oop;

public class Company {

	public static void main(String[] args) {
		Employee emp = new Employee("jagadeeesh",1997,15000.0);
		emp.setSal(25000.0);
		System.out.println(emp.getSal());
		System.out.println(emp.name);
		System.out.println(emp.eid);
	}

}
