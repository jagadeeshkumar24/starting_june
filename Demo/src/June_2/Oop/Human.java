package June_2.Oop;
import java.lang.*;
public class Human {
	String name;
	String gender;
	public Human(String name,String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	
}

class Employee1 extends Human{
	double sal;
	String job;
	public Employee1(String name,String gender,double sal,String job) {
		super(name,gender);
		this.sal = sal;
		this.job = job;
	}
}

class Company1{
	public static void main(String[] args) {
		Employee1 emp = new Employee1("jagadeesh", "male", 3000.0, "softewareEngineer");
		System.out.println(emp.gender);
		System.out.println(emp.name);
		//System.out.println(emp.toString()); 
		Employee1 emp1 = new Employee1("raju", "male", 2000.0, "bevarse");
		System.out.println(emp1.name);
		System.out.println(emp1.sal);
		//emp1.equals(emp);
		
		
	}
}
