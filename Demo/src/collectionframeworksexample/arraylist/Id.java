package collectionframeworksexample.arraylist;
import java.util.*;
public class Id implements Comparator<Student3>{
	public int compare(Student3 o1,Student3 o2) {
		return o1.getId()-o2.getId();
	}
}

 class Name implements Comparator<Student3>{
	public int compare(Student3 o1,Student3 o2) {
		return  o1.getName().compareTo( o2.getName());
	}
}
  class Age implements Comparator<Student3>{
		public int compare(Student3 o1,Student3 o2) {
			return o1.getAge()-o2.getAge();
		}
	}
 
  class Marks implements Comparator<Student3>{
		public int compare(Student3 o1,Student3 o2) {
			return o1.getMarks()-o2.getMarks();
		}
	}
