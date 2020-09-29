import java.util.*;

class q13{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First number: ");
		int a=sc.nextInt();
		System.out.println("Enter a Second number: ");
		int b=sc.nextInt();
		System.out.println("Enter a Third number: ");
		int c=sc.nextInt();
		
		if(a > b && a > c){
			
			System.out.println(a+" is greater");
		}
		else if(b>a && b>c){
			
			System.out.println(b+" is greater");
		}
		else{
			System.out.println(c+" is greater");
		}
		
	}
	
}

class q13A{
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First number: ");
		int a=sc.nextInt();
		System.out.println("Enter a Second number: ");
		int b=sc.nextInt();
		System.out.println("Enter a Third number: ");
		int c=sc.nextInt();
		
		int max=(a > b)?(a>c?a:c):(b>c?b:c);
		System.out.println(max+" is greater");
	
		
	}
}