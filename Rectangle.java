import java.util.Scanner;
public class Rectangle{
 public static void main(String[] args){ 
  float length,breadth,area,perimeter;
  Scanner s= new Scanner(System.in);
  System.out.println("enter length:");
  length=s.nextFloat();
 

  Scanner b=new Scanner(System.in);
  System.out.println("enter breadth:");
  breadth=b.nextFloat();
    
  area=length*breadth;
  System.out.println("area:"+area);
  perimeter=2*(length + breadth);
  System.out.println("perimeter:"+perimeter);
    
}   
}   
    

