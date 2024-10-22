import java.util.*;
public class DivisibleNumber
{

   public static void main(String x[])
   {
           Scanner xyz = new Scanner(System.in);
           System.out.println(" Enter number a");
           int a = xyz.nextInt();

           String result = a%5==0 && a%11==0? "This number is divisible by 5 and 11" :"This number is not divisible by 5 and 11";
           System.out.println(result);
   }
}

           