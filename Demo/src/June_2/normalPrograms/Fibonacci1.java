package June_2.normalPrograms;
//1.WAP to print Fibnocci series
//0 1 1 2 3 5 8 13
public class Fibonacci1 {

	public static void main(String[] args) {
		int f1=0, f2=1;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=0;i<=10;i++) {
			int 	f3 =f1+f2;
			System.out.println(f3);
		
			f1 =f2;
			f2=f3;
		}
	}

}
