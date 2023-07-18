package June_2.collections;

import java.util.ArrayList;

public class CollectionsMethods {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add('a');
		al.add("hi");
		al.add(14);
		al.add(15.8);
		al.add(null);
		al.add(true);
		ArrayList al1 = new ArrayList();
		al1.add("java");
		al1.add(14);
		al1.add(15.8);
		al1.add(98.4);
		System.out.println(al);//[a, hi, 14, 15.8, null, true]
		System.out.println(al1);//[java, 14, 15.8, 98.4]
//		al.add(al1);
//		System.out.println(al);//[a, hi, 14, 15.8, null, true, [java, 14, 15.8, 98.4]]
//		al.addAll(al1);
//		System.out.println(al);//[a, hi, 14, 15.8, null, true, java, 14, 15.8, 98.4]
//		al.remove(null);
//		System.out.println(al);//[a, hi, 14, 15.8, true]
//		al.removeAll(al1);
//		System.out.println(al);//[a, hi, null, true]
//		al.retainAll(al1);
//		System.out.println(al);//[14, 15.8]
//		al.clear();
//		System.out.println(al);//[]
//		al.contains(14);
//		System.out.println(al);
//		al.containsAll(al1);
//		System.out.println(al);
		System.out.println(al.size());//6
		System.out.println(al.isEmpty());//false
		al.clear();
		System.out.println(al);//[]
		System.out.println(al.isEmpty());//true
		
	}

}
