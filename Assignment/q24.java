import java.util.*;


class q24{
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]={10,20,30,40,50};
		System.out.print("Enter a number: ");
		int search=sc.nextInt();
		boolean flag=true;
		for(int i=0;i<arr.length;i++){
			
			if(search==arr[i]){
				
				System.out.println("Element Found: "+arr[i]);
				flag=false;
				//break;
			}
			
			
		}
		if(flag){
			System.out.println("Element Not Found");
		}
		
			
		
	}
	
}