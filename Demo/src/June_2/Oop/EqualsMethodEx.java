package June_2.Oop;
public class EqualsMethodEx {
	String bn;
	double tp;
	public EqualsMethodEx(String bn, double tp) {
		super();
		this.bn = bn;
		this.tp = tp;
	}
	@Override
	public boolean equals(Object obj) {
		EqualsMethodEx temp = ((EqualsMethodEx)obj);
		return this.bn == temp.bn && this.tp == temp.tp;
	}	
}
class Car1{
	public static void main(String[] args) {
		EqualsMethodEx em = new EqualsMethodEx("audi", 300.0);
		EqualsMethodEx em1 = new EqualsMethodEx("audi", 300.0);
		System.out.println(em.equals(em1));
		System.out.println(em1.equals(em));
		//true
		//true
	}
}
