package arrayprograms;
import java.util.Scanner;
public class ArraysExamples1 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		 System.out.println("enter the size");
	int size=scanner.nextInt();
		 String[] obj=new String[size];
		 for(int i=0;i<obj.length;i++) {
			 System.out.println("enter the values");
			 obj[i]=scanner.next();
		 }
		 System.out.print("[");
		 for(String a:obj) {
			 System.out.print(a+" ");
		 }
		 System.out.print("]");
		 
	}
}
