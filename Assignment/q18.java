import java.util.*;


class q18{
	
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=num/2;i++){
			
			if(num%i==0){
				
				System.out.println("Not a prime number");
				flag=false;
				break;
			}
			
			
		}
		if(flag)
		{
			
			System.out.println("Entered number is prime number");
		}			
		
		
	}
	
}