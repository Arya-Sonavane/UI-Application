import java.util.*;
public class VoterEligibility
{

    public static void main(String x[])
    {
         Scanner xyz = new Scanner(System.in);
         System.out.println("Enter your age");
         int age = xyz.nextInt();

         if(age>=18)
         {
         System.out.println("You are eligible to vote");
         }else
         {
         System.out.println("You are not eligible to vote");
         }
     }
}
