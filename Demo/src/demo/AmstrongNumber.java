package demo;

public class AmstrongNumber{

	public static void main(String[] args) {
		int num=151,temp=num;
		int sum=0,r;
		while(num>0) {
			r=num%10;
			num=num/10;
			sum=sum+(r*r*r);
		}
		if(temp==sum){
		System.out.println(temp+ ": is amstrong number");
		}
		else {
			System.out.println(temp+": is not amstrong number");
		}
	}

}
