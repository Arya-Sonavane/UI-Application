import java.util.*;
public class CodeChef
{
    public static void main(String x[])
    {
      int t,X,Y;
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter no of test cases");
      t=xyz.nextInt();
      System.out.println("Enter price of first cab service");
      X=xyz.nextInt();
      System.out.println("Enter price of second cab service");
      Y=xyz.nextInt();

      if(X<Y)
      {
       System.out.println("Enter first cab service price");
      }
      else if(Y<X)
      {
       System.out.println("Enter second cab service price");
      }
      else{
       System.out.println("Any");
      }
     }
}

     

      