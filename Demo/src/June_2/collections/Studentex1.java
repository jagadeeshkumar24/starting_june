package June_2.collections;

import java.util.TreeSet;

import June_2.Oop.ToStringEx;

public class Studentex1 {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<>(new MarksComp());
		ts.add(new Student(3,"ram",45));
		ts.add(new Student(2,"prasad",65));
		ts.add(new Student(5,"ramu",95));
		ts.add(new Student(6,"laxmi",78));
		ts.add(new Student(3,"krishna",99));
		int c = 0;
		for(Student s: ts) {
			c++;
			if(c==3) {
				System.out.println(s);
				break;
			}
		}
	}

}
