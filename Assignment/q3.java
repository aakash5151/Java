
class q3{

public static void main(String args[]){

boolean x=false;
boolean y=true;
//double y = (x * x + 3 * x - 7);
//System.out.println(y);

//int y= x++ + ++x;
//System.out.println("x= "+x+"\ny= "+y);

 //int z = x++ - --y - --x  +  x++ ;
 //System.out.println("x= "+x+"\ny= "+y+"\nz= "+z);
 
 boolean z = x && y || !(x || y) ;
 System.out.println(z);
}
}