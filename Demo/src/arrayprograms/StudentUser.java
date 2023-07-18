package arrayprograms;
import java.util.*;
public class StudentUser {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		createStudentArr();
	}
	public static void createStudentArr() {
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		StudentBp[] s =new StudentBp[size];
		for(int i=0;i<=s.length-1;i++) {
			System.out.println("enter the student name");
			String  sN=sc.next();
			System.out.println("enter the roll no ");
			int rN=sc.nextInt();
			s[i] =new StudentBp(sN,rN);
			
		}
		printarr(s);
	}
	public static void printarr(StudentBp[] args) {
		System.out.println("the object of student inserted");
		for(  StudentBp s : args) {
			System.out.println(s);
		}
	}

}
