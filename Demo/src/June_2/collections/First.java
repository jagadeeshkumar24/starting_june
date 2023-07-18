package June_2.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class First {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("java");
		al.add(100);
		al.add(null);
		al.add('c');
		System.out.println(al);
		ListIterator li = al.listIterator() ;
		System.out.println("forward direction");
		while(li.hasNext()) {
			System.out.println(li.next());	
		}
		System.out.println("backward direction");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
