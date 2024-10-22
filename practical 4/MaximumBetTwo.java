import java.util.*;
public class MaximumBetTwo
{
     public static void main(String x[])
     { 
         Scanner xyz = new Scanner(System.in);
         System.out.println("Enter value for x");
         int p= xyz.nextInt();
         System.out.println("Enter value for y");
         int y= xyz.nextInt();

         String result= p>y ? "p is maximum number" : "y is maximum number" ;

         System.out.println("maximum number is "+result);
     }
}