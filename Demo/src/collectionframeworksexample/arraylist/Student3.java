package collectionframeworksexample.arraylist;

public class Student3 {
	private int id;
	private String name;
	private int age;
	private int marks;
	public Student3(int id, String name, int age, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
}
