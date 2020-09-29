import java.util.*;

class MathOperation{
	
	
	
	static void multiply(int a,int b){
		
		System.out.println("Mul1= "+(a*b));
	}
	
	static void multiply(float a,float b,float c){
		
		System.out.println("Mul2= "+(a*b*c));
	}
	
	static void multiply(int arr[])
	{	int sum=1;
		for(int i=0;i<arr.length;i++){
			
			sum*=arr[i];
		}
		System.out.println("Mul3= "+sum);
	}
	static void multiply(double a,int b){
		
		System.out.println("Mul4= "+(a*b));
	}
	
}

class MathOpeDemo{
	
	public static void main(String args[]){
		int arr[]={1,2,3,4};
		MathOperation.multiply(4,2);
		MathOperation.multiply(2.2f,3.2f,4.2f);
		MathOperation.multiply(arr);
		MathOperation.multiply(4.2,2);
	}
}