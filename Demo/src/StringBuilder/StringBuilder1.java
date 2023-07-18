package StringBuilder;

public class StringBuilder1 {
public static void main(String[] args) {
	String s="jagadeesh";
	StringBuffer str1= new StringBuffer("kumar");
	StringBuilder str=new StringBuilder(s);
	str.reverse();
	str.deleteCharAt(3);
	System.out.println(str);
	System.out.println("**************************");
	str1.reverse();
	System.out.println(str1);
	
}
}
