package arrayprograms;
import java.util.*;
public class Searching {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array");
		int size =sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the elements ");
			a[i]=sc.nextInt();
		}
		int e = 4,index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==e) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("element not found");
		}else {
			System.out.println("element is found: "+index);
		}

	}

}
