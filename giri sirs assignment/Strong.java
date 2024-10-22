import java.util.*;
public class Strong
{
  public static void main(String x[])
  {
    int n,c,fact,rem,sum=0;
    Scanner xyz=new Scanner(System.in);
    n=xyz.nextInt();
    c=n;
    while(n!=0)
    {
      rem=n%10;// find last digit
      fact=1;
      for(int i=1;i<=rem;i++)
      {
        fact=fact*i;
      }
      sum=sum+fact;
      n=n/10;
    }
    if(sum==c)
    {
      System.out.print("no is strong");
    }
   else
    {
      System.out.print("no is not strong");
    }
  }

}