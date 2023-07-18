package collectionframeworksexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class OccEx {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(10);
		al.add(70);
		al.add(40);
		System.out.println(al);
		TreeSet<Integer> ts = new TreeSet<Integer>(al);
		System.out.println(ts);
		Iterator<Integer> itr = ts.iterator();
		while(itr.hasNext()) {
			int count =0;
			Integer i=itr.next();
			for(Object o:al) {
				if(i==o) {
					count++;
				}
			}
			System.out.println(i+"occurrence :"+count+" in times");
		}
		
		
	}

}
