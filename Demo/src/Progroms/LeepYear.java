package Progroms;

public class LeepYear {

	public static void main(String[] args) {
		int year=2020;
		// if the year divisible by 400 
		// if the year divisible by 4 but not 100;
		if((year % 400 ==0 )||( year % 4==0 && year % 100 !=0)) {
			System.out.println(year+" is a leep year");
		}
		else {
			System.out.println(year+" is a not leep year");
		}
	}

}
