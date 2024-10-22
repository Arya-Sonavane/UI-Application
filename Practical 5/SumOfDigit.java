import java.util.*;
public class SumOfDigit
{
     public static void main(String x[])
     {
         Scanner xyz=new Scanner(System.in);
         System.out.println("Enter Three Digit Number");
         int num = xyz.nextInt();

         System.out.println("Number before sum:" +num);
         int rem, sum=0;


         rem= num%10;
         num= num/10;
         sum= sum+rem;

         rem= num%10;
         num= num/10;
         sum= sum+rem;

         rem= num%10;
         num= num/10;
         sum= sum+rem;

         System.out.println("Number after sum:"+sum);
      }
}

         
         
