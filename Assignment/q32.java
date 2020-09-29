class Student{
	
	int rno;
	String name;
	static int c;
	Student(){
		
		c++;
	}
	void setData(int r,String n){
		rno=r;
		name=n;
	}
	void showData(){
		
		System.out.print("\nrollno= "+rno+"\nName= "+name);
			
	}
	void display(){
		System.out.println("\nObject created= "+c);
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
		s2.display();
		//s1.showData();
		
		
	}
	
}