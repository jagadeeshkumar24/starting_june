package customExceptions;

public class Clock {
	private int hr;
	private int mn;
	private int sc;
	public Clock(int hr, int mn, int sc) {
		if((hr>=0 &&hr<=12) && (mn>=0 && mn<=59) && ( sc>=0 &&  sc <=59)) {
		this.hr = hr;
		this.mn = mn;
		this.sc = sc;
		}else {
			throw new ToSetProperTime();
		}
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		if(hr>=0 && hr<=12) {
		this.hr = hr;
		}
		else {
			throw new ToSetProperTime();
		}
	}
	public int getMn() {
		return mn;
	}
	public void setMn(int mn) {
		if(mn>=0 && mn<=59) {
		this.mn = mn;
		}
		else {
			throw new ToSetProperTime();
		}
	}
	public int getSc() {
		return sc;
	}
	public void setSc(int sc) {
		if(sc>=0 && sc<=59) {
		this.sc = sc;
		}
		else {
			throw new ToSetProperTime();
		}
	}
	
	
}
