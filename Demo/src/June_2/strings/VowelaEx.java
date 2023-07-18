package June_2.strings;

//2. WAP to find smaller case vowels from string s="javadev" 
//a.print vowels b.count vowels
public class VowelaEx {

	public static void main(String[] args) {
		String s = "javadeveloper";
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println(s.charAt(i));
				count++;
			}
				
		}
		System.out.println(" count of  vowels  lowercase : "+count); 

	}

}
