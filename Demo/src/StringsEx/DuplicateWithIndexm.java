package StringsEx;
import java.util.*;
public class DuplicateWithIndexm {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the String");
		String s=sc.next();
		String str ="";
		for(int i=0;i<s.length();i++) {
			if(s.indexOf(s.charAt(i))==-1)
				str=str+s.charAt(i);
			
		}
		System.out.println(str);

	}

}
