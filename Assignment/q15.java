import java.util.*;

class q15{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c=sc.next().charAt(0);
		int age=sc.nextInt();
		if((c=='f' && age>=18)||(c=='m' && age>=21)){
			
			System.out.println("person is eligible for marriage");
		}
		else
		{
			
			System.out.println("person is NOT eligible for marriage");
		}
		
	}
	
}