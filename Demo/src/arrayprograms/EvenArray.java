package arrayprograms;
import java.util.*;
public class EvenArray {
	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] n=new int[size];
		for(int i=0;i<n.length;i++) {
			System.out.println("enter the values");
			n[i]=sc.nextInt();
		}
		int[] m=n;
		for(int i=0;i<size;i++) {
			int c=0;
			for(int j=0;j<size;j++) {
				if(n[i]==m[j] && i>j) 
					break;
				if(n[i]==m[j])
					c++;
			}
				if(c>=1){
				System.out.println(n[i]+" occarance "+c);
			}
		}	
	}
}
