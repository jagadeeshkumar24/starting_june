package June_2.Oop;

public class A {
	static int i = 10;
		int j =20;

}
 class B extends A{
	static int k =10;
		int l =30;
}

class User{
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.toString());
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
		System.out.println(obj.l);
		
	}
}
