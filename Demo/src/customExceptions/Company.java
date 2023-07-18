package customExceptions;

public class Company {

	public static void main(String[] args) {
		Employee e1=new Employee("jagadeesh",10000.0);
		
		e1.setSal(15000.0);
		System.out.println(e1.getSal());
	}
	

}
