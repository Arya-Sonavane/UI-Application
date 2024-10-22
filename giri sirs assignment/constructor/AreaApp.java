import java.util.*;
class Area
{
  float radius;
float area;
int area1;
  Area(float radius)
  {
     
     area=radius*radius*3.14f;
 System.out.println("circle area is"+area);
  }
  Area(int length,int width)
 {
    
        area1= length*width;
 System.out.println("Rectangle area is"+area1);
 }

}

public class AreaApp
{
  public static void main(String args[])
  {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter radius");
    float radius=xyz.nextFloat();
    Area area=new Area(radius);
    System.out.println("Enter length and width");
    int length=xyz.nextInt();
    int width=xyz.nextInt();
    Area b=new Area(length,width);
  }
} 
   
    
    
  