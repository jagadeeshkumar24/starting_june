package arrayprograms;

public class OccrancseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,4,3,5,6,2};
		int oc[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int c=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]){
					c++;
					oc[j]=1;
				}
				
			}
			if(c>=1&&oc[i]!=1){
				System.out.println(a[i]+" "+c);
			}
		}
	}

}
