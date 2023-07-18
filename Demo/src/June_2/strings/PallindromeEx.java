package June_2.strings;

//WAP to check whether the given string is pallindrome or not. 
//a."madam" b."Mom"
public class PallindromeEx {

	public static void main(String[] args) {
		String s = "Mom";
		String str = "";
		for(int i=0;i<s.length();i++) {
			str = s.charAt(i)+str;
		}
		System.out.println("actual String: "+s);
		System.out.println("rev String: "+str);
		if(s.equalsIgnoreCase(str)) {
			System.out.println("Given string is pallindrome");
		}else {
			System.out.println("Given string is not pallindrome");
		}
	}

}
