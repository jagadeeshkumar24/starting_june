package StringsEx;

public class ReverseWord {

	public static void main(String[] args) {
		String s ="java html css";
		System.out.println(s);
		
		System.out.println(rev(s));
		System.out.println(rev1(s));
		System.out.println(rev2(s));
	}
	public static String rev(String s) {
		String str="";
		for(int i=0;i<s.length();i++) {
			str=s.charAt(i)+str;
		}
		return str ;
	}
	public static String rev1(String s) {
		String[] s1=s.split(" ");String str="";
		for(int i=0;i<s1.length;i++) {
			str=s1[i]+" "+str;
		}
		return str;
	}
	public static String rev2(String s) {
		String[] s1=rev(s).split(" ");String str="";
		for(int i=0;i<s1.length;i++) {
			str=s1[i]+" "+str;
		}
		return str;
	}
	
}
