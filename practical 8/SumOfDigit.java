import java.util.*;
public class SumOfDigit
{
     public static void main(String x[])
    {
          int no,rem, sum = 0;
          Scanner xyz=new Scanner(System.in);
          System.out.println("enter no");
          no=xyz.nextInt();

          while(no!=0)
          { rem=no%10;
            no=no/10;
            sum=sum+rem;
        }
      System.out.println(sum);
    }

    
}
          
