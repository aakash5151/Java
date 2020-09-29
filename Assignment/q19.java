import java.util.*;
import java.lang.*;
class q19{
	
	public static void main(String args[]){
		
	Scanner sc=new Scanner(System.in)	;
	System.out.println("Enter a number to calculate series: ");
	int num=sc.nextInt();
	double sum=0;
	for(int i=1;i<=num;i++){
		
	 //sum=sum+(i*i);
	 sum=sum+Math.pow(i,2);
		
	}
	
	System.out.println("Sum of series: "+sum);
	
		
	}
	
}