import java.util.*;

class q9{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a days: ");
		int day = sc.nextInt();
		int year=day/365;
		int year1=day%365;
		
		int months=year1/30;
		int months1=year1%30;
		
		int days=months1;
		
		System.out.println(year+" Year,"+months+" months,"+days+" days");
		
		
			
	}
	
}