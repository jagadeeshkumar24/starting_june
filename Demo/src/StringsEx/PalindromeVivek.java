package StringsEx;

import java.util.Scanner;

public class PalindromeVivek {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.next();
		
//		String s = "madam";
		String str = "";
		for(int i=0;i<s.length();i++) {
			str=s.charAt(i)+str;
		}
		if(s.equals(str)) {
			System.out.println(str + " is palindrome");
		}
		else {
			System.out.println(str + " is not palindrome");
		}

	}

}
