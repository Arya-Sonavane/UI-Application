import java.util.*;
public class Armstrong
{
  public static void main(String x[])
  {
    int n,rem,c,arm=0;
    System.out.print("enter any number");
    Scanner xyz=new Scanner(System.in);
    n=xyz.nextInt();
    c=n;
    
    while(n>0)
    {
      rem=n%10;
      arm=rem*rem*rem+arm;
      n=n/10;
    }
    if(c==arm)
    {
      System.out.print("armstrong number");   

    }
    else
    {
      System.out.print("not armstrong number");
    }
    

  }

}
