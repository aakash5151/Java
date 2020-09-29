import java.util.*;

class q21{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int arr[]=new int[10];
		float sum=0;
		for(int i=0;i<arr.length;i++){
			
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			
			sum+=arr[i];
		}
		System.out.println("Sum= "+sum);
		float avg=(float)(sum/10);
		System.out.println("Average= "+avg);
		
		
		
	}
}