import java.util.*;
public class LeapYear
{
    public static void main(String x[])
    {
         Scanner xyz= new Scanner(System.in);
         System.out.println("Enter year");
         int year = xyz.nextInt();

         String result= year%4==0 ? "This year is Leap year" : "This year is not Leap year";
         System.out.println(result);
    }
}