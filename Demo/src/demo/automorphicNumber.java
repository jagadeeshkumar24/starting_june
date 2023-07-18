package demo;

public class automorphicNumber {
	public static boolean isautomorphic(int n) {
		int sq = n * n ;
		while(n>0) {
			if(n%10 != sq%10) {
				return false;
			}
			n/=10;
			sq/=10;
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		System.out.println((isautomorphic(76))? "is automorphic" : "is not automophic");
		System.out.println((isautomorphic(537))? "is automorphic" : "is not automophic");
	}
}
