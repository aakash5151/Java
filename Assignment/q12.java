import java.util.*;

class q12{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary: ");
		double sal=sc.nextDouble();
		if(sal < 10000){
			
			double hra=(sal*0.10);
			double da=(sal*0.90);
			
			double Gross=(sal+hra+da);
		System.out.println("Your Gross Salary is: "+Gross);
			
		}
		else if(sal>=10000)
		{
			double hra=(2000);
			double da=(sal*0.98);
			
			float Gross=(float)(sal+hra+da);
		System.out.println("Your Gross Salary is: "+Gross);
			
			
		}
		
	}
	
}