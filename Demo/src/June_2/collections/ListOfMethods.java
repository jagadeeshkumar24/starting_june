package June_2.collections;

import java.util.ArrayList;

public class ListOfMethods {

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
		System.out.println(al);
	}

}
