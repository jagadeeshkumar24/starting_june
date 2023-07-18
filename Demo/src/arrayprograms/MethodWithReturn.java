package arrayprograms;
public class MethodWithReturn {

	public static void main(String[] args){
		createArr();
		for(int a : createArr()) {
			System.out.println(a);
			
		}

	}
	public static int[] createArr() {
		int[] obj=new int[3];
		return obj;
	}

}
