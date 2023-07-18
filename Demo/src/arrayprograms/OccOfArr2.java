package arrayprograms;
import java.util.*;
public class OccOfArr2 {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("enter the size");
		int size =sc.nextInt();
		int[] n=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the values");
			n[i] =sc.nextInt();
		}
//		vivekSirLogic(n);
			for(int k=0;k<n.length;k++) {
				int count=1;
				for(int j=k+1;j<n.length;j++) {
					
					if(n[k]==n[j]) {
						count++;
						n[j]=1;
					}
				}
				if(count>=1&&n[k]!=1){
					System.out.println(n[k]+" "+count);
				}
			}
		
	}
	
//	public static void vivekSirLogic(int arr[]) {
//		int b[]=arr;
//		for (int i=0;i<arr.length;i++) {
//			int count=0;
//			for(int j=0;j<b.length;j++) {
//				if(arr[i]==b[j] && i>j)
//					break;
//				if(arr[i]==b[j])
//					count++;
//			}
//			if(count>=1)
//				System.out.println(arr[i]+" occurance "+count);
//		}
//	}
}
