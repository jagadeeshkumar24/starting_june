package customExceptions;

public class Employee {
	String name;
	private double sal;
	public Employee(String name, double sal) {
		this.name = name;
		if(sal>=10000.0) {
		this.sal = sal;
		}
		else {
			throw new SalaryIncorrectException();
		}
		
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		if(sal>=10000.0) {
		this.sal = sal;
		}
		else {
			throw new SalaryIncorrectException();
		}
	}
	
	
}
