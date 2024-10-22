import java.util.*;
public class TriangleSide
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

         String result = a==b && a==c && b==c ? "it is equilateral traiangle"  :
                         (a==b && b!=c ? "it is isolateral triangle" :
                         (a!=b && b!=c && a!=c ? "it is scalene triangle":"no")) ;
         System.out.println(result);
     }
}