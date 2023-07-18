package June_2.collections;

import java.util.Comparator;

public class MarksComp implements Comparator<Student> {
	public int compare(Student o1 ,Student o2) {
		return (int)(o2.marks - o1.marks);
		
	}
}
