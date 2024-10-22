import java.util.*;
public class DuckNumber1toNth
{
     public static void main(String x[])
    {
          int no,j=1,count;
          Scanner xyz=new Scanner(System.in);
          System.out.println("Enter a number");
          no=xyz.nextInt();
          int j=0;
          int flag=0;

          while(n>0)
          {
            j=no%10;
            if(j==0)
            {
                flag++;
                break;
             }
                no=no/10;
            }
              if (flag==0)
              {
                 System.out.println("no is Duck");
              }
              else
              {
                 System.out.println("no is not duck");
              }
    }
}

            
         