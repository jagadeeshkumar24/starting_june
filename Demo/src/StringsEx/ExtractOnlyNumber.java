package StringsEx;

public class ExtractOnlyNumber {

	public static void main(String[] args) {
		String s = "1jaf2lkasd4jf5k6";
		//o/p 1+2+4+5+6=18
		
		System.out.println(sum(s));//18
	}
	
	public static int sum(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>'0'&& s.charAt(i)<'9') {
				sum=sum+s.charAt(i)-'0';
			}
		}
		return sum;
	}

}
