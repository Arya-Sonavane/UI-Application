import java.util.*;
public class SumOfEvenOdd
{
       public static void main(String x[])
       {
            int no, SumOfEven=0, SumOfOdd=0;
            Scanner xyz= new Scanner(System.in);
            no = xyz.nextInt();
            int i =1;
 
            while(i<=no)
            {
              if(i%2==0)
		{
                SumOfEven=SumOfEven+i;
                }
              else
                {
                SumOfOdd= SumOfOdd+i;
                }
              i++;
             }
             System.out.println(SumOfEven);
             System.out.println(SumOfOdd);

          }
}
            
                