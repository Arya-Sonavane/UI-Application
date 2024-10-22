import java.util.*;
public class CodeChef
{
    public static void main(String x[])
    {
      int X,Y;
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter value for first cab service");
      X=xyz.nextInt();
      System.out.println("Enter value for second cab service");
      Y=xyz.nextInt();

       if(X<Y)
      {
       System.out.println("First cab"+ X);
      }
      else if(X==Y)
      {
       System.out.println("Second cab"+ Y);
      }
      else{
       System.out.println("Any");
      }
     }
}

     

      