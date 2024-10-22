import java.util.*;
public class SimpleInterest
{
     public static void main(String x[])
     {
         Scanner xyz=new Scanner(System.in);
         System.out.println("Enter value for p");
         float p = xyz.nextFloat();
         
         System.out.println("Enter value for R");
         float r = xyz.nextFloat();
        
         System.out.println("Enter value for T");
         float t = xyz.nextFloat();

         float simpleInterest=p*r*t/100;
         System.out.println("simple interest is"+simpleInterest);
      }
}
          
         
