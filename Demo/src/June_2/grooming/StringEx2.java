package June_2.grooming;

public class StringEx2 {

	public static void main(String[] args) {
		String s = "viratkohli";
		// o/p ---> "viratKOHLI";
		String str ="";
		for(int i=0;i<s.length();i++) {
			if(i<s.length()/2) {
				str = str+s.charAt(i);
			}else {
				str = str+(char)(s.charAt(i)-32);
			}
		}
		System.out.println(str);
	}

}
