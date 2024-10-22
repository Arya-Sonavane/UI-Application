import java.util.*;
public class Triangle
{
    public static void main(String x[])
    {
         Scanner xyz = new Scanner(System.in);
         System.out.println("enter value for a");
         int a=xyz.nextInt();
         System.out.println("enter value for b");
         int b=xyz.nextInt();
         System.out.println("enter value for c");
         int c=xyz.nextInt();

         String result = (a+b>c) && (a+c>b) && (b+c>a) ? "it is valid triangle" : "it is invalid triangle" ;
         System.out.println(result);
     }
}



         