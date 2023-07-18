package June_2.normalPrograms;
//WAP to swap two numbers
//a.using third variable
//b.without using third variable

public class Swap2Num {

	public static void main(String[] args) {
		int a=20,b=30;
		int c=a;
		a=b;
		b=c;
		System.out.println("swap the numbers: "+a+"----"+b);
	}
}
	class Swap3{
		public static void main(String[] args) {
			int a=45,b=30;
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("swap the numbers: "+a+"----"+b);
		}
	}
