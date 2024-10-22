import java.util.*;
class Rectangle
{
  int a,b;
   
 void setLengthWidth(int len,int wid)
  {
    a=len;
    b=wid;
  }
 void showArea()
  {
    double area=a*b;
    System.out.printf("area of rectangle is %f\n", area);
  }
}
 public class RecAreaApp
 {
   public static void main(String x[])
   {
      Scanner xyz=new Scanner(System.in);
      Rectangle r=new Rectangle();
      r.setLengthWidth(3,6);
      r.showArea();
      
   }
 }