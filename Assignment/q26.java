class q26{
	
	public static void main(String args[]){
		
		int sum=0;
		int arr[][]={{1,2,3},
					 {4,5,6},
					 {7,8,9},
					{10,11,12},
					{13,14,15,16,17}
		
		};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
				
			}
			
		}
		
		System.out.println("Sum of 17 elements is= "+sum);
	}
	
}