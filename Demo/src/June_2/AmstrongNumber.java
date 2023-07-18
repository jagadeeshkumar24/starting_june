package June_2;
import java.util.*;
public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int sum=0,rem,temp=num;
		int result = count(num);
		while(num>0) {
			rem=num%10;
			sum = sum+ multiply(rem,result);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is amstrong number");
		}else {
			System.out.println(temp+" is not amstrong number");
		}

	}
	public static int multiply(int num,int power) {
		int product =1;
		for(int i=1;i<=power;i++) {
			product = product*num;
		}
		return product;
	}
	public static int count(int num) {
		int count =0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}

}
