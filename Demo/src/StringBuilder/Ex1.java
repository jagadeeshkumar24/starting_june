package StringBuilder;

public class Ex1 {
	public static void main(String[] args) {
		long i= 245640932345643432l;
		String s1="jagadeesh kumar animireddy";
		StringBuilder sb=new StringBuilder(String.valueOf(i));
		System.out.println(sb.reverse());
		
		System.out.println("************************************");
		
		StringBuilder s= new StringBuilder();
		s.append(s1);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		
	}
}
