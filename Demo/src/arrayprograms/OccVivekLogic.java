package arrayprograms;
import java.util.Scanner;
public class OccVivekLogic {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size ");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the values");
			a[i]=sc.nextInt();
		}
		int[] b=a;
		for(int i=0;i<size;i++) {
			int count=0;
			for(int j=0;j<size;j++) {
				if(a[i]==b[j] && i>j)
					break;
				if(a[i]==b[j])
					count++;
			}
			if(count>=1) {
				System.out.println(a[i]+"occurs"+count);
			}
		}
		

	}

}
