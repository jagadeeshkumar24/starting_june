package June_2;

//very important concept ******

public class IIbEx1 {
	int i =10;
	static int j =20;
	{
		System.out.println("from iib");
		System.out.println(this);
		System.out.println(this.i);//using this keyword we access non-static members
		System.out.println(i);//directly accessing non-static members
		System.out.println(this.j);//static members accessing using this keyword
		System.out.println(IIbEx1.j);//static members accessing using class name 
		System.out.println(j);//directly accessing static members
		
	}
	public static void main(String[] args) {
		System.out.println("hello world");
		IIbEx1 obj = new IIbEx1();
		System.out.println(obj);//after object creation then accessing object reference variable
		//in non-static members(variable/methods)
		System.out.println("***********");
		IIbEx1 obj1 = new IIbEx1();
		System.out.println(obj1);
		System.out.println(obj1.i);
		
		
	}
}
