package June_2;

public class MethodReturnFacebook {

	public static void main(String[] args) {
		System.out.println("main begins");
		System.out.println (login("jagadeesh","jaggu123"));
		System.out.println("main ends");
	}
	public static String login(String username,String password) {
		return("login of "+username+" is successfull");
	}

}
