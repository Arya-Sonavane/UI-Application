import java.util.*;
class Area
{
  float radius;

void setDetails(float a)
{
  radius=a;
}
void showArea()
{
  double area=radius*radius*3.14;
  System.out.printf("Area is %f\n", area);
}

}

public class AreaApp
{
  public static void main(String x[])
  {
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter a radius");
     float a=xyz.nextFloat();

     Area b=new Area();
     b.setDetails(a);
     b.showArea();
  }
}