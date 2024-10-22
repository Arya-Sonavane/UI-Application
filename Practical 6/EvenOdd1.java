import java.util.*;
public class EvenOdd1
{
    public static void main(String x[])
    {
    int a,rem;
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter value a");
    a= xyz.nextInt();
    rem=a%2;
    if(rem==0)
    {
    System.out.println("no is Even");
    }
    else
    {
    System.out.println("no is odd");
    }
    }
}
