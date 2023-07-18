package June_2.strings;

//WAP to check count of e/E character present in a String s="javaEEdeve"
public class Count_Ex1 {

	public static void main(String[] args) {
		String s = "javaEEdeve";
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='e'|| s.charAt(i)=='E') {
				count++;
			}
		}
		System.out.println("count of e/E: "+count);
			
	}

}
