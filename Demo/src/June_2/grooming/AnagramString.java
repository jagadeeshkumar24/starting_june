package June_2.grooming;

import arrayprograms.*;
public class AnagramString {

	public static void main(String[] args) {
		//anagram check for first length of two string and
		//one string every should be present another string then it is anagram 
		//other wise not anagram....
		String s = "silent";
		String s1 = "listen";
		int count=0;
		if(s.length()==s1.length()) {//length checking
		char[]ch1 =	s.toCharArray();//{'s','i','l','e','n','t'}
		char[]ch2 =	s1.toCharArray();//same
		sort(ch1);
		sort(ch2);
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==ch2[i]) {
				count++;
			}
			else {
				System.out.println("they are not anagram");
			}
		}
		if(count==s.length()) {
			System.out.println("this is anagram");
		}
		
		}else {
			System.out.println("they are not anagram");
		}
	}

	private static void sort(char[] ch1) {
		// TODO Auto-generated method stub
		
	}

	

}
