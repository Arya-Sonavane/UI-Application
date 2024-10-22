import java.util.*;
public class MaximumBetThree
{
    public static void main(String x[])
    {
           Scanner xyz = new Scanner(System.in);
           System.out.println("Enter value for a");
           int a = xyz.nextInt();
           System.out.println("Enter value for b");
           int b = xyz.nextInt();
           System.out.println("Enter value for c");
           int c = xyz.nextInt();

           String result= a>b && a>c ? "a is maximum number" : (b>a && b>c ? "b is maximum number" : "c is maximum number");

           System.out.println(result);
    }
}
 


           