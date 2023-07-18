package June_2.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Occurence {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(7);
		al.add(3);
		al.add(6);
		al.add(5);
		al.add(3);
		al.add(2);
		System.out.println(al);
		HashSet hs = new HashSet(al);
		
		ArrayList al1 = new ArrayList(hs);
		
		for(int i=0;i<al1.size();i++) {
			int count=0;
			for (int j = 0; j < al.size(); j++) {
				if(al.get(j)==al1.get(i)) {
					count++;
				}
				
			}
			System.out.println(al1.get(i)+"--->"+count);
		}
	}

}
class Occerence1{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(7);
		al.add(3);
		al.add(6);
		al.add(5);
		al.add(3);
		al.add(2);
		System.out.println(al);
		HashSet<Integer> hs = new HashSet<Integer>(al);
		System.out.println(hs);
		for(int i: hs) {
			int c =0;
			for(int j:al) {
				if(i==j) {
					c++;
				}
			}
			System.out.println(i+"--->"+c);
		}
	}
}