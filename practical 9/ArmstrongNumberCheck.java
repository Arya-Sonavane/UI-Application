import java.util.*;
public class ArmstrongNumberCheck
{
     public static void main(String x[])
    {
          int no,sum=0,count;
          Scanner xyz=new Scanner(System.in);
          System.out.println("Enter a number");
          no=xyz.nextInt();
          int temp=no;

	
	count=0;
	while(no!=0)
	{
		count++;
		no/=10;
	}
	System.out.println("Count Is :"+count);
	no=temp;
          while(no!=0)
          {
              int rem=no%10;
              //sum=sum+(int)Math.pow(rem,count);
		int i=1,p=1;
		while(i<=count)
		{
			p=p*rem;
			i++;
		}
		sum=sum+p;
              no=no/10;

          }
           String result = sum==temp? "number is armstrong":"number is not armstrong";
           System.out.println(result);
    }
}
          