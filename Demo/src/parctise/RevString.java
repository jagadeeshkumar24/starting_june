package parctise;

public class RevString {

	public static void main(String[] args) {
		String s= "java html css";
		System.out.println(s);
		System.out.println(rev(s));
		System.out.println(rev1(s));
		System.out.println(rev2(s));
		System.out.println(rev3(s));
	}
	//expected output
	
	// ssc lmth avaj
	//css html java 
	//ssc lmth avaj
	//avaj lmth ssc 

	public static String rev(String s) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			
			 s1=s.charAt(i)+s1;
		}
		return s1;
	}
	
	public static String rev1(String s) {
		String []s1=s.split(" "); String  s2="";
		for(int i=0;i<s1.length;i++) {
			s2=s1[i]+" "+s2;
		}
		return s2;
	}
	public static String rev2(String s) {
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			
			 s1=s1+s.charAt(i);
		}
		return s1;
	}
	public static String rev3(String s) {
		String []s1=rev(s).split(" "); String  s2="";
		for(int i=0;i<s1.length;i++) {
			s2=s1[i]+" "+s2;
		}
		return s2;
	}
	
	

}
