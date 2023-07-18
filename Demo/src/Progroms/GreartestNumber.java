package Progroms;
import java.util.*;
public class GreartestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("enter the number1");
		int num1 =a.nextInt();
		System.out.println("enter the number2");
		int num2=a.nextInt();
		if(num1==num2) {
			System.out.println("is equals");
		}
		else {
			System.out.println(Math.max(num1, num2)+"is greatest");
		}
		//by using ternary operator
		/*else {
			int temp=num1>num2 ? num1 : num2;
			System.out.println(temp+" is greatest");
		}*/
		// by using if else ladder
//		else if(num1>num2){
//			System.out.println(num1+" is greatest");
//		}
//		
//		else{
//			System.out.println(num2+" is greatest");
//		}
	}

}
