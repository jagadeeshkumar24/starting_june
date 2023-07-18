package collectionframeworksexample.arraylist;
import java.util.*;
public class ArrayList5 {
//	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("java");
	al.add("c");
	al.add("c++");
	al.add("javaScript");
	al.add("Hi");
	System.out.println(al);
	
	ListIterator itr =al.listIterator();
	while(itr.hasNext()) {
		String s = (String) itr.next();
		if(s.equals("javaScript")) {
			itr.set("Python");
		}
		else if(s.equals("Hi")){
			itr.remove();
		}
	}
	System.out.println(al);
	}

}
