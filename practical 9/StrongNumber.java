import java.util.*;
public class StrongNumber
{
     public static void main(String x[])
    {
          int no,i,fact,sum=0;
          Scanner xyz=new Scanner(System.in);
          System.out.println("Enter a number");
          no=xyz.nextInt();
          int temp=no;

          while(no!=0)
          {
                 int rem= no%10;
                 fact=1;
                 i=1;
                 while(i<=rem)
           {
             fact= fact*i;
             i++;
           }
             sum=sum+fact;
             no=no/10;
         }
           
           System.out.println("Sum is:"+sum);
           String result= sum==temp?"it is strong number":"it is not strong number";
           System.out.println(result);
        }
}
           
      
