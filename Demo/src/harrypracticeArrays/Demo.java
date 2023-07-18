package harrypracticeArrays;

import java.util.Scanner;

public class Demo {
	String name;
	int rno;
	public Demo(String name, int rno) {
		super();
		this.name = name;
		this.rno = rno;
	}
	@Override
	public String toString() {
		return "Demo [name=" + name + ", rno=" + rno + "]";
	}
	
}

//user logic

 class User{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		createStudentArr();
	}
	static void createStudentArr() {
		System.out.println("enter the size");
		int size  = sc.nextInt();
		Demo[] s = new Demo[size];
		for(int i=0;i<s.length;i++) {
			System.out.println("enter tha s.name :");
			String sn = sc.next();
			System.out.println("enter the rno :");
			int rno = sc.nextInt();
			s[i] = new Demo(sn,rno);
			
		}
		printArray(s);
		
	}
	static void printArray(Demo[] args) {
		System.out.println("the object of student inserted");
		for(Demo n: args) {
			System.out.println(n);
		}
	}
	
}
