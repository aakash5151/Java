class q25{
	
	public static void main(String args[]){
		
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int Evensum=0;
		int Oddsum=0;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0){
				
				Evensum=Evensum+arr[i];
			}
			if(arr[i]%2!=0){
				
				Oddsum=Oddsum+arr[i];
			}
			
		}
		System.out.println("Sum of Even Element= "+Evensum+"\nSum of Odd Element= "+Oddsum);
	}
	
}