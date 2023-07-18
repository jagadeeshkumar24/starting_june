package June_2.strings;

public class Occurence {
	public static void main(String[] args) {
		String s = "java",str="";
		for(int i=0;i<s.length();i++) {
			int count =0;
			for(int j=i;j>=0;j--) {
				if(s.charAt(i)==s.charAt(j))
					count++;
			}
			if(count==1) {
				str = str+s.charAt(i);
			}
		}
		System.out.println(str);
	}
}
