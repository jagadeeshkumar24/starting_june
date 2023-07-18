package ExceptionHandling;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P2 {

	public static void main(String[] args) throws FileNotFoundException {
		speak();
		
	}
	public static void speak() throws FileNotFoundException {
		cry();
	}
	public static void cry() throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("D:\\geca20");
	}

}
