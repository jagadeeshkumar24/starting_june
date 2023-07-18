package collectionframeworksexample.arraylist;

import java.util.*;

public class P1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		for(int i=1;i<=8;i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(prime(i)) {
				itr.remove();
			}
		}
		System.out.println(al);
	}
	public static boolean prime(int i) {
		int fc=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				fc++;
			}
		}
		return fc==2;
	}
	
	
}
