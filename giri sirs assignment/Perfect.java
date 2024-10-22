import java.util.*;
public class Perfect
{
  public static void main(String x[])
  {
    int n,sum=0;
    System.out.print("enter no");
    Scanner xyz=new Scanner(System.in);
     n=xyz.nextInt();
     for(int i=1; i<n; i++)
     {
       if(n%i==0)
       {
         sum=i+sum;
       }
        

     }
    if(n==sum)
    {
      System.out.print("its perfect no");
    }
    else
    {
      System.out.print("Its not perfect no");
    }
  }

}