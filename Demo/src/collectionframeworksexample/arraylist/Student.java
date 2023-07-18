package collectionframeworksexample.arraylist;

public abstract class Student implements Comparable<Student> {
	private String name;
	private int id,age;
	public Student(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

}
