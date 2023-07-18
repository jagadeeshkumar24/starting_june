package June_2.Oop;

public class ToStringEx {
	String bname;
	double millage;
	double topSpeed;
	public ToStringEx(String bname, double millage, double topSpeed) {
		super();
		this.bname = bname;
		this.millage = millage;
		this.topSpeed = topSpeed;
	}
	@Override
	public String toString() {
		return "ToStringEx [bname=" + bname + ", millage=" + millage + ", topSpeed=" + topSpeed + "]";
	}
	
}
class CarDriver{
	public static void main(String[] args) {
		ToStringEx tse = new ToStringEx("benz",30.0, 200.0);
		System.out.println(tse.toString());
		System.out.println(tse);
	}
}
//ToStringEx [bname=benz, millage=30.0, topSpeed=200.0]
//ToStringEx [bname=benz, millage=30.0, topSpeed=200.0]

