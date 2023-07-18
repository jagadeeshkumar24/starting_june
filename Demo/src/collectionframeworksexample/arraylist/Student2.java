package collectionframeworksexample.arraylist;

import java.util.*;

public class Student2 {

	public static void main(String[] args) {
//		TreeSet<Student1> ts= new TreeSet<Student1>();
		ArrayList<Student1> ts= new ArrayList<Student1>();
		ts.add(new Student1("js",1,1,20));
		ts.add(new Student1("java",2,2,37));
		ts.add(new Student1("json",3,3,34));
		ts.add(new Student1("c",4,4,75));
		ts.add(new Student1("c++",5,5,60));
		ts.add(new Student1("jaggu",6,5,6));
		Collections.sort(ts);
//		System.out.println(ts);
		System.out.println("after sorting");
		Student1 s =null;
		int index =0;
//		Iterator<Student1> al = ts.iterator();
//		while(al.hasNext() && index<3) {
//			s=al.next();
//			index++;
		
//	}
		System.out.println(ts);
//		System.out.println(ts.get(2));
	}

}

