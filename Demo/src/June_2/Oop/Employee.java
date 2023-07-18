package June_2.Oop;

public class Employee {
	String name;
	int eid;
	private double sal;
	public Employee(String name,int eid,double sal) {
		this.name=name;
		this.eid = eid;
		if(sal>=10000.0) {
			this.sal = sal;
		}else {
			System.out.println("enter right salary");
		}
			
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getSal() {
		return sal;
	}
}
