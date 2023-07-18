package feb23.basics.practice;

public class A1 {

	public static void main(String[] args) {
		char ch ='A';
		char ch1 = 'a';
		int i =1;
		while(ch<='Z' && ch1<='z' && i<=26) {
			System.out.println(ch +""+i+""+ch1);
			ch++;
			ch1++;
			i++;
		}
				
	}

}
