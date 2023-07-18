package June_2.normalPrograms;

//	10. WAP to count all numbers present between 1 to 30 which are divisible by 5
//what ,why ,where,when,how
public class Count {

	public static void main(String[] args) {
		int c=0;
		for(int i=0;i<=30;i++) {
			if(i%5==0) {
				c++;
				
			}
		}
		System.out.println("count all numbers : "+c);
	}

}
