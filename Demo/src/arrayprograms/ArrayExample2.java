package arrayprograms;
import java.util.Scanner;
public class ArrayExample2 {
	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size");
		int size= sc.nextInt();
		double[] marks=new double[size];
		for(int i=0;i<marks.length;i++) {
			System.out.println("enter the marks");
			marks[i]=sc.nextDouble();		
		}
		double[] newmarks=new double[marks.length];
		for(int i=0;i<marks.length;i++) {
			newmarks[i]=marks[i];
		}
		System.out.print("[");
		for(double a : newmarks) {
			System.out.print(a+" ");
		}
		System.out.print("]");
		
	}
	
}
