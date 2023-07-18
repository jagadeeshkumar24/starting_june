package collectionframeworksexample;

import java.util.*;

public class CF1 {
	static Scanner  sc= new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
			
		}
		System.out.println(al);
//		for(int i=0;i<n;i++) {//frist way to creating iteration
//			System.out.println(al.get(i));
//		}
//		for(Object o : al) {//second way to creating iteration
//			System.out.println(o);
//		}
		Iterator e =al.iterator();
//		while(e.hasNext()) {
//			System.out.println(e.next());
//		}
		ListIterator itr = al.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
	

}
