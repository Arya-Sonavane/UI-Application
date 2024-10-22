import java.util.*;
class Rectangle
{
   int length,width,area;
   void setlengthwidth(int length,int width)
    {
          this.length=length;
          this.width=width;
    }
    void showArea()
    {
       area=length*width;
       System.out.printf("Area %d:",area);
    }
     
}
public class RectangleApp
{
   public static void main(String x[])
   {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the length");
     int length=xyz.nextInt();
      System.out.println("Enter the width");
     int width=xyz.nextInt();
      
    Rectangle r1=new Rectangle();
     r1.setlengthwidth(length,width);
     r1.showArea();
 }
}