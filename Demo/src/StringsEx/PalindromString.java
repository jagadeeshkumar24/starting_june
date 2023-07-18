package StringsEx;
import java.util.Scanner;
public class PalindromString {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("enter the strig");
		String s=sc.next();
		System.out.println(rev(s));
		System.out.println( polindrome(s)); 
		
				
//		for(int i=s.length()-1;i>=0;i--) {
//			s1=s1+s.charAt(i);
//		}
//		if(s.equals(s1)) {
//			System.out.println("is polindrome");
//		}
//		else {
//			System.out.println("is not polindrome");
//		}
//		
	}
	public static String polindrome(String s) {
		
		if(s.equals(rev(s))) {
			return "polindrome";
		}
		else {
			return "notpolindrome";
		}
		
	}
	public static String rev(String s) {
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		return s1;
		  
	}
	
}
