package omprakash;

import java.util.Arrays;

public class Arraysdemo1 {
public static void main(String[] args) {
	int[] i= {50,44,54,34,67};
	System.out.println("Before Sorting  :");
	for(Integer a:i) {
	System.out.print (a+" ");	
	}
	Arrays.sort(i);
	System.out.println("\nAfter Sorting  :");
	for(Integer a:i) {
	System.out.print (a+" ");	
	}
	
}
}
