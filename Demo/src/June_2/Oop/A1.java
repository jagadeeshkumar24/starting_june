package June_2.Oop;

public class A1 {
	int i = 10;
	public void p1() {
		System.out.println("from p1 super class");
	}
}
class B1 extends A1{
	int j = 20;
	public void p2() {
		System.out.println("from p2 sub class");
	}
}
class P1 {
	public static void main(String[] args) {
		A1 obj =new B1(); //Auto-upcasting 
		System.out.println(obj.i);
		obj.p1();
		
		B1 obj1 =((B1)obj);//explict downcasting using type caste operator
		
		System.out.println(obj1.j);
		obj1.p2();
		
		
		
	}
}

