import java.util.*;
public class CompoundInterest
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

         double CI=p*(Math.pow((1+r/100),t));
         System.out.println("Compound Interest is"+CI);
     }
}
          
         
         
         
         
          
         
         