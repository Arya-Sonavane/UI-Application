import java.util.*;
public class Arm1ToNth
{
     public static void main(String x[])
    {
          int no,sum,count,temp;
          Scanner xyz=new Scanner(System.in);
          System.out.println("Enter a number");
          no=xyz.nextInt();
         int j=1;
	while(j<=no)
	{
	temp=j;
	count=0;
	sum=0;
	while(temp!=0)
	{
		count++;
		temp/=10;
	}
	//System.out.println("Count Is :"+count);
	temp=j;
          while(temp!=0)
          {
              int rem=temp%10;
              //sum=sum+(int)Math.pow(rem,count);
		int i=1,p=1;
		while(i<=count)
		{
			p=p*rem;
			i++;
		}
		sum=sum+p;
              temp=temp/10;

          }
           if(sum==j)
	   {
		System.out.println(j);
	   }
		j++;
	}
    }
}
          