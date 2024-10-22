import java.util.*;
public class PerfectNumbercheck
{
     public static void main(String x[])
    {
          int no, sum=0,i=1;
          Scanner xyz=new Scanner(System.in);
          System.out.println("Enter a number");
          no=xyz.nextInt();


          while(i<no)
          {
          
               if(no%i==0)
           {
               sum=sum+i;
           }
              i++;
          }
              if(sum==0)
              {
                System.out.println("Number is perfect");
              }
              else
               {
                 System.out.println("no is not perfect");
              }
        }
}


