package June_2.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		String str = "";
		for(int i=0;i<s.length();i++) {
			str = s.charAt(i) + str;
		}
		System.out.println(str);
	}

}
