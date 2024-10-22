import java.util.*;
public class NaturalNoSum
{
     public static void main(String x[])
    {
          int no, i=1,sum=0;
          Scanner xyz=new Scanner(System.in);
          System.out.println("Enter number");
          no = xyz.nextInt();
          
          while(i<= no)
       {
          
          sum=sum+i;
          System.out.println(i+ "");
          
          i++;
       }
    }
}
        