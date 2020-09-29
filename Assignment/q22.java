import java.util.*;


class q22{
	
	public static void main(String args[]){
		
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("Array element in Descending order: ");
		//for(int a:arr){
			//System.out.print(" "+a);
		//}
		for(int i=0;i<arr.length;i++){
			
			System.out.print(" "+arr[i]);
		}
	}
}

class q22A{
	
	public static void main(String args[]){
		
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		Arrays.sort(arr);
	
	
	for(int i=(arr.length-1);i>=0;i--){
			
			System.out.print(" "+arr[i]);
		}
	}
}