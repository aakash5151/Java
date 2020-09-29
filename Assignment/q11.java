import java.util.*;

class q11{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First number: ");
		int a=sc.nextInt();
		System.out.println("Enter a Second number: ");
		int b=sc.nextInt();
		System.out.println("Before swapping: ");
		System.out.println("a="+a+" b="+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		System.out.println("After Swapping");
		System.out.println("a="+a+" b="+b);
		
	}
	
}