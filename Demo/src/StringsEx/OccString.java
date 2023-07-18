package StringsEx;

import java.util.Scanner;

public class OccString {
	static Scanner sc =new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("enter the string");
		String s =sc.next();
		String s1=s;
		for(int i=0;i<s.length();i++) {
			int c =0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)&& i>j) {
					break;
				}
				if(s.charAt(i)==s.charAt(j)) {
					c++;
				}
			}
			if(c>=1) {
				System.out.print( s.charAt(i));
			}
		}

	}

}
