import java.util.*;
import java.util.*;
class Area
{
  int length,width;

  void setLengthWidth(int m, int n)
  {
     length=m;
     width=n;

  } 
 void showArea()
 {
   int area= 2*(length*width);
   Ststem.out.println("Area is");

 } 

}


public class AreaAppplication
{
   public static void main(String x[])
   Scanner xyz= Scanner(System.in);
    int m,n;
   System.out.println("Enter length");
    m=xyz.nextInt();
   System.out.println("Enter width");
   n=xyz.nextInt();
   
   Area a=new Area();
   a.setLengthWidth(m,n);
   
   a.showArea();
}