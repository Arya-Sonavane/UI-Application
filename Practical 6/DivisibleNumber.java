import java.util.*;
public class DivisibleNumber
{
    public static void main(String x[])
    {
      int no;
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter no");
      no=xyz.nextInt();

      if((no%5==0) && (no%11==0))
      {
      System.out.println("Number is even");
      }
      else
      {
      System.out.println("Number is odd");
      } 
     }
}