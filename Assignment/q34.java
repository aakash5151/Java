import java.util.*;
import java.lang.*;

class Circle{
	
	private float radius;
	private float area;
	
	void init(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a radius: ");
		radius=sc.nextFloat();
		
	}
	
	void calculateArea(){
		
		area=3.14f*radius*radius;
		//System.out.println(Math.PI);
		
		
	}
	void display(){
		//System.out.println("Inside display");
		System.out.println("Area of circle= " + area);
		
	}
	
}

class CircleDemo{
	
	public static void main(String args[]){
		
		Circle c=new Circle();
		c.init();
		c.calculateArea();
		c.display();
	}
}