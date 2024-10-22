import java.util.*;
public class AngleCheck
{
     public static void main(String x[])
     {
         int a,b;
         Scanner xyz=new Scanner(System.in);
         System.out.println("enter value of first angle a");
         a=xyz.nextInt();
         System.out.println("enter value of first angle b");
         b=xyz.nextInt();
         
         int c= 180-(a+b);
         System.out.println("Third angle is"+c);
     }
}
         
         
         