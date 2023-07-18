package June_2.grooming;

public class StringManipulation {

	public static void main(String[] args) {
		String s ="abcdefg";
		// o/p -->acegbdf
		String 	str ="";String even ="";
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)%2==0) {
				even = even+s.charAt(i);
			}
			else {
				str=str+s.charAt(i);
			}
		}
		System.out.println(str+even);
	}

}
