package June_2.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Second {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("programming");
		al.add("love");
		al.add("india");
		Collections.sort(al);
		System.out.println("incresing sorted order:\n "+al);
		Collections.reverse(al);
		System.out.println("Reversed sorted order:\n "+al);
	}

}
