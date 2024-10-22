import java.util.*;
class Circle
{
    float radius;    
  
void setRadius(float a)
  {
     
    radius=a;

  }

void showArea()
 {
  
  
   float area=(radius*radius)*3.14f;

   System.out.println("Area of circle is "+area);
	

 }

}

public class AreaApp
 {
     public static void main(String x[])
     {
        Scanner xyz=new Scanner(System.in);
        System.out.println("Enter radius");
        float a=xyz.nextFloat();

        Circle c =new Circle();
        c.setRadius(a);
        c.showArea();

     }


 }