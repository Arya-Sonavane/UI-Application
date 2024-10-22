import java.util.*;
public class Duck1toNth
{
     public static void main(String x[])
    {
          int j=0, no,count,temp,REM;
          Scanner xyz=new Scanner(System.in);
          System.out.println("Enter a number");
          no=xyz.nextInt();

	 while(j<=no)
        {
          temp=j;
          int flag=0;
             while(temp>0)
            {
               REM=temp%10;
              if(REM==0)
              {
                flag++;
                break;
              }
                temp=temp/10;
            }
              if (flag==1)
              {
                 System.out.println(j);
              }
	j++;
	  }
    }
}

            
         