package June_2.Oop;

public class Box {
	double length;
	double bredth;
	double height;
	public Box(double length,double bredth) {
		this.length = length;
		this.bredth = bredth;
	}
	public Box(double length,double bredth,double height) {
		this(length,bredth);
		this.height = height;
	}
	public void areaOfDimention() {
		System.out.println(length);
		System.out.println(bredth);
		if(height>0.0)
			System.out.println(height);
	}
}
