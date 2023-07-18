package demo;

public class A {

	public static void main(String[] args) {
		int a[]= {5,2,6,8,1,9};
		int sum=0;
		for(int i=1;i<a.length;i++){
			if(a[i]%2==0){
			sum=sum+a[i];
			}
			
		}
		System.out.println(sum);

	}

}
