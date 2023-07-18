package harrypracticeArrays;

public class ArraySum {

	public static void main(String[] args) {
		//sum of elements in array
		/*int []a= {2,46,64,67,88,87,34};
		int sum=0;
		for(int i : a) {
			sum = sum+i;
		}
		System.out.println("The value sum is "+sum); 
		*/
		
		//the value in the present the array or not?
		
		/* float [] f= {23.9f,45.6f,66.7f,75.7f,25.7f,75.6f};
		float num = 66.7f;
		boolean isArray = false;
		for(float element : f) {
			if(num == element ) {
				isArray = true;
			    break;
			}
		}
		if(isArray) {
			System.out.println("the value is present in the array");
		}
		else {
			System.out.println("the value is not  present in the array");
		}  */
		
		
		//problem 3
		
		/*float [] marks= {58.9f,45.6f,66.7f,75.7f,86.7f,75.6f};
		float sum = 0;
		for(float i : marks) {
			sum = sum+i;
		}
		System.out.println("The value of average marks sum is "+sum/marks.length);
		**/
		
		//problem 4
		
		int [][]a= {{3,6,7},
					{7,4,8}};
		int [][]b={{6,6,4},
				{3,7,9}};
					
		int [][]result={{0,0,0},
						{0,0,0}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.format("settings values for i=%d and j=%d\n",i,j);
				result[i][j]=a[i][j] + b[i][j];
			}
		}
		//printing the elements of 2-D array
		for(int i=0;i<a.length;i++) {//row no of time
			for(int j=0;j<a[i].length;j++) {//column no of time
				System.out.print(result [i][j]+" ");
				result[i][j]=a[i][j] + b[i][j];
			}
			System.out.println("");//printing new line
		}
	}

}
