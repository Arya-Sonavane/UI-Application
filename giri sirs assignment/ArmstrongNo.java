import java.util.*;
public class ArmstrongNo
{
  public static void main(String x[])
  {
    int n,c,rem,arm=0;
    Scanner xyz=new Scanner(System.in);
    n=xyz.nextInt();
    c=n;

    for(int i=1; i<=n; i++)
    {
      while(n>0)
      {
        rem=n%10;
        arm=rem*rem*rem+arm;
        n=n/10;
      }
      if(c==arm)
      {
        System.out.print("its armstrong");
      }
      else
      {
        System.out.print("its not armstrong");
      }

    }

  }
}