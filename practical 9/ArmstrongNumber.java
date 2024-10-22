import java.util.*;
public class ArmstrongNumber
{
     public static void main(String x[])
    {
          int no,sum=0;
          Scanner xyz=new Scanner(System.in);
          System.out.println("Enter a number");
          no=xyz.nextInt();
          int temp=no;

          while(no!=0)
          {
              int rem=no%10;
              sum=sum+(rem*rem*rem);
              no=no/10;

          }
           String result = sum==temp? "number is armstrong":"number is not armstrong";
           System.out.println(result);
         }
}
          