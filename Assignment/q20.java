import java.util.*;


class q20{
	
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first interval: ");
		int first=sc.nextInt();
		System.out.println("Enter a second interval: ");
		int second=sc.nextInt();
		boolean flag;
		System.out.print("Prime numbers are: ");
		while(first<=second){
			 flag=true;
			
			
		for(int i=2;i<=first/2;i++){
			
			if(first%i==0){
				
				//System.out.println("Not a prime number");
				flag=false;
				break;
			}
			
			
		}
		if(flag)
		{
			System.out.print(first+" ");
			//System.out.println("Entered number is prime number");
		}
     ++first;		
		
		
	}
	}
	
}