package StringsEx;

public class StringEx1 {

	public static void main(String[] args) {
		String s=new String("jsp");
		System.out.println(s);
		System.out.println(s.toString());
		String s1=new String("jsp");
		System.out.println(s.equals(s1));
		String s2="java";
		System.out.println(s.toString());
		String s3="java";
		String s4="Java";
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		String s5=new String("java");
		String s6=new String("java");
		System.out.println(s5==s6);
		

	}

}
