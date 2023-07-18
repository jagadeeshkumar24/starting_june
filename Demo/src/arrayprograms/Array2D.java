package arrayprograms;

import java.util.Scanner;

public class Array2D {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size of rows");
		int rs =sc.nextInt();
		System.out.println("enter the size of column ");
		int cs=sc.nextInt(); 
		int [][]a=new int[rs][cs];
		for(int i=0;i<rs;i++) {
			for(int j=0;j<cs;j++) {
				System.out.println("enter the elements for the postins"+i+"&"+j);
				a[i][j]=sc.nextInt();
			}
			
			
		}
		System.out.println(" to given array");
		for(int i=0;i<rs;i++) {
			for(int j=0;j<cs;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("to transpose in the given arry");
		for(int j=0;j<cs;j++) {
			for(int i=0;i<rs;i++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
