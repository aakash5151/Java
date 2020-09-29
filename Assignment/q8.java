import java.util.*;

class q8{
	
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Principal: ");
		float p=sc.nextFloat();
		System.out.println("enter a Rate of interest: ");
		float r=sc.nextFloat();
		System.out.println("enter a year: ");
		float n=sc.nextFloat();
		 float si=  (p*n*r)/100;
		 System.out.println("Simple Interest= "+si);
		 	
	}
}