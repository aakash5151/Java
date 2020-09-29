import java.util.*;

class q7{
	
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks : ");
		System.out.println("C++: ");
		int a=sc.nextInt();
		System.out.println("DS: ");
		int b=sc.nextInt();
		System.out.println("AWP: ");
		int c=sc.nextInt();
		System.out.println("MEAN: ");
		int d=sc.nextInt();
		System.out.println("OS: ");
		int e=sc.nextInt();
		
		int totalmarks=a+b+c+d+e;
		//System.out.println("total = "+totalmarks);
		float FinalTotal=(float)(totalmarks)/500;
		//System.out.println("finaltotal = "+FinalTotal);
		float per=(float)(FinalTotal*100);
		System.out.println("percentage marks = "+per+"%");
		
		
		
	}
}