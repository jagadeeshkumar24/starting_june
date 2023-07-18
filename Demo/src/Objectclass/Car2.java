package Objectclass;


class Car2{
	String bn;
	double tp;
	public Car2(String bn, double tp) {
		super();
		this.bn = bn;
		this.tp = tp;
	}
	public boolean equals(Object obj) {
		Car2 temp=((Car2)obj);
		return this.bn==temp.bn && this.tp==temp.tp ;
	}
	
}
