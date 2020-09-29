import java.util.*;

class q17{
	
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n=sc.nextInt();//12345
	int sum=0;
	while(n!=0){
		
		int rem=n%10;
		sum=sum*10+rem;
		n/=10;
	}
	System.out.println("Reverse number: "+sum);
	
	
}
	
}