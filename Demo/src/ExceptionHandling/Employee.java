package ExceptionHandling;

public class Employee {
	String ename ;
	private double sal;
	public Employee(String ename, double sal) {
		super();
		this.ename = ename;
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
