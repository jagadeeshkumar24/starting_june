package ExceptionHandling;

public class Clock {
	private int hr;
	private int mn;
	private int sec;
	public Clock(int hr, int mn, int sec) {
		if((hr>0 && hr<13) && ( mn>=0 && mn<60) && (sec>=0 && sec <60) ) {
			this.hr = hr;
			this.mn = mn;
			this.sec = sec;
		}
		else {
			throw new TosetProperTime();	
		}
		
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		if(hr>0 && hr<=12) {
		this.hr = hr;
		}
		else {
			throw new TosetProperTime();
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
			throw new TosetProperTime();
		}
		
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		if(sec>=0 && sec <=59) {
		this.sec = sec;
		}
		else {
			throw new TosetProperTime();
		}
	}
	
	
}
