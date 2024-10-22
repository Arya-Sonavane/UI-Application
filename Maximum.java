import java.util.*;
public class Maximum
{
     public static void main(String x[])
     {    
         int a,b,c;
         Scanner xyz = new Scanner(System.in);
         System.out.println("enter the first n number");
         a = xyz.nextInt();
         
         System.out.println("enter the second n number");
         b = xyz.nextInt();

         System.out.println("enter the third n number");
         c = xyz.nextInt();

         if(a>b && a>c)
         {
          System.out.println("Largest Number"+ a); 
         }
         else if(b>a && b>c)
          {
          System.out.println("Largest Number"+ b);
          }
         else
          {
          System.out.println("Largest Number"+ c);
          }
      }
}
          

         
         