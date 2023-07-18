package June_2.collections;

public class StringEx1 {
	public static void main(String[] args) {
		String s =" html3 css5 java1 python2 c++4";
		String[] a = s.split(" ");
		//String str = "" ;
		String s1[] = new String[a.length];
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			int m =a[i].length()-1;
			char ch = a[i].charAt(m);
			int k = Integer.parseInt(ch+"");
			s1[k-1] = a[i].substring(0,m);
		}
		String res = "";
		for(String r : s1) {
			res = res + r + " ";
		}
		System.out.println(res);
	}
}
