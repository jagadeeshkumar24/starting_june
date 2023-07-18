package June_2.grooming;

public class StringEx1 {

	public static void main(String[] args) {
		String s = "j1a2v3a5";
		int sum =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				sum = (s.charAt(i)-48)+sum;
			}
			
		}
		System.out.println(sum);
	}

}
