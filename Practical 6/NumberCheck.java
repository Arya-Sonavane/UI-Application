import java.util.*;
public class NumberCheck
{
    public static void main(String x[])
    {
    int a;
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter no a");
    a=xyz.nextInt();

    if(a>0)
    {
     System.out.println("no is positive");
    }
    else if(a==0)
    {
     System.out.println("no is zero");
    } 
    else
    {
    System.out.println("no is negative");
    }
    }
}
    
