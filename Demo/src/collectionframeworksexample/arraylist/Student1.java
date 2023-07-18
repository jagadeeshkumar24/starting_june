package collectionframeworksexample.arraylist;
import java.util.*;
public  class Student1 implements Comparable<Student1> {
	 String name;
	 int id,age,marks;
	
	public Student1(String name, int id, int age, int marks) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", id=" + id + ", age=" + age + ", marks=" + marks + "]\n";
	}


	public int compareTo(Student1 o) {
		return this.age-o.age;
	}
}


