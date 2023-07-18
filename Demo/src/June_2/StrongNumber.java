package June_2;

public class StrongNumber {

	public static void main(String[] args) {
		int num=145,rem,sum=0,temp=num;
		while(num!=0) {
			rem=num%10;
			sum=sum+facto(rem);
			num=num/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is strong no");
		}else {
			System.out.println(temp+" is not strong no");
		}

	}
	public static int facto(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
