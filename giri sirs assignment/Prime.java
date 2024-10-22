import java.util.*;
public class Prime
{
  public static void main(String x[])
  {
    int n,count=0;
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter number");
    n=xyz.nextInt();
    for(int i=1; i<=n; i++)
    {
      if(n%i==0)
      {
        count++;
      }
    }
    if(count==2)
    {
       System.out.print("prime no");
    }
    else
    {
       System.out.print("not prime");
    }
  }
}