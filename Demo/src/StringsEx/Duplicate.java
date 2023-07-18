package StringsEx;
import java.util.*;
public class Duplicate {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the String");
		String s=sc.next();
		String str="";
		for(int i=0;i<s.length();i++) {
			int c=0;
			for(int j=i;j>=0;j--) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;
				}
			}
			if(c==1)
				str=str+s.charAt(i);
		}
		System.out.println(str);
		
		
				
				
				
	}
}
