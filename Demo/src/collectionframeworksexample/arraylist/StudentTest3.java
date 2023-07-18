package collectionframeworksexample.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest3 {

	public static void main(String[] args) {
		ArrayList<Student3> al=new ArrayList<Student3>();
		al.add(new Student3(23,"jaggu",25,98));
		al.add(new Student3(20,"raj",25,90));
		al.add(new Student3(22,"kiran",25,98));
		al.add(new Student3(21,"naresh",24,99));
		System.out.println(al);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
		Collections.sort(al,new Id());
		System.out.println(al);
		System.out.println("***********");
		Collections.sort(al,new Name());
		System.out.println(al);
	}

}
