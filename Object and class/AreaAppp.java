import java.util.*;
class Circle
{
  float a;
  void setRadius(float radius)
  {
    a=radius;
  }
  void showArea()
  {
    
    double area=a*a*3.14;
    System.out.printf("Area of circle is %f\n", area);
   
  }
}
public class AreaAppp
{
   public static void main(String x[])
   {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter radius");
    int radius=xyz.nextInt();
   
    Circle c=new Circle();
     c.setRadius(5);
     c.showArea(); 
   }
}