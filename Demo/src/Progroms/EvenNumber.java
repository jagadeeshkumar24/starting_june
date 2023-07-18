package Progroms;
import java.util.Scanner;
public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
//		if(isEven(num)) {
//			System.out.println("is even");
//		}
//		else {
//			System.out.println("is odd");
//		}
//		if(num%2==0) {
//			System.out.println(num+" is the num is Even");
//		}else {
//			System.out.println(num+" is the num is Odd ");
//		}
		//by using ternary operator
		String status=(num%2==0)?(" is even"):(" is odd");
		System.out.println(num+status);
		//by using method 
	}
//	 static int isEven( int number) {
//		return ((number & 1));
//	}

}
