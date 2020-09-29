import java.util.*;

class q28{
	
	public static void main(String args[]){
		
		String s[]={"Hello world","Hello CDACians"};
		
		System.out.println(s.length);
		//int len=s.length();
		//System.out.println(len);
		/*
		for(int i=0;i<s.length;i++){
			
			System.out.println(s[i]);
		}
		*/
		
		for(String a:s){
			
			System.out.println(a);
		}
		
	}
	
}

class q28A{
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a size: ");
	int size=sc.nextInt();
	String str[]=new String[size];
	sc.nextLine();///flushing String buffer
	for(int i=0;i<str.length;i++){
		
		str[i]=sc.nextLine();
		
		
	}
	System.out.print("\noutput-------\n   ");
	for(String i:str){
		System.out.println(i);
		
	}
	
	
	}
}