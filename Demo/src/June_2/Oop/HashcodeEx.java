package June_2.Oop;

public class HashcodeEx {
	String bn;
	double tp;
	public HashcodeEx(String bn, double tp) {
		super();
		this.bn = bn;
		this.tp = tp;
	}
	public String  address() {
		return super.getClass().getName()+"@"+Integer.toHexString(super.hashCode());
	}
}
class CarDriver2{
	public static void main(String[] args) {
		HashcodeEx car1 = new HashcodeEx("tata",180.34);
		System.out.println(car1.hashCode());
		System.out.println(car1.toString());
		System.out.println(car1.address());
	}
}
