import java.util.*;
public class OddNoSum
{
       public static void main(String x[])
       {
            int no,sum=0;
            Scanner xyz= new Scanner(System.in);
            no = xyz.nextInt();
            int i =1;
 
            while(i<=no)
            {
              if(i%2!=0)
		{
                 sum=sum+i;
                }
              i++;
             }
             System.out.println(" sum of odd "+ sum);
               
          }
}