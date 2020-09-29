import java.util.*;

class MathOperation{
	
	
	
	static int add(int a,int b){
		
		return a+b;
	}
	static int subtract(int a,int b){
		
		return a-b;
	}
	static int multiply(int a,int b){
		return a*b;
		
	}
	static double power(int a,int b){
		
		return Math.pow(a,b);
		
	}
	
}

class MathOpeDemo{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res1=MathOperation.add(a,b);
		int res2=MathOperation.subtract(a,b);
		int res3=MathOperation.multiply(a,b);
		double res4=MathOperation.power(a,b);
		System.out.println("Addition= "+res1);
		System.out.println("Subtraction= "+res2);
		System.out.println("Multiply= "+res3);
		System.out.println("Power= "+res4);
		
		
	}
}