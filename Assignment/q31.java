class Student{
	
	int rno;
	String name;
	
	void setData(int r,String n){
		rno=r;
		name=n;
	}
	void showData(){
		
		System.out.print("\nrollno= "+rno+"\nName= "+name);
			
	}
	
	
	
}
class studentDemo{
	
	public static void main(String args[]){
		
		Student s1=new Student();
		Student s2=new Student();
		//Student s2=s1;
		s1.setData(101,"Aakash");
		s1.showData();
		s2.setData(102,"Shubham");
		s2.showData();
		
		//s1.showData();
		
		
	}
	
}