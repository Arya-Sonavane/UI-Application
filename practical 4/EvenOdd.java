import java .util.*;
public class EvenOdd
{

     public static void main(String x[])
     {
       Scanner xyz = new Scanner(System.in);
       System.out.println("Enter number a");
       int a = xyz.nextInt();

       String result = a%2 == 0? "This number is Even" : "This number is odd";
       System.out.println(result);
     }
}