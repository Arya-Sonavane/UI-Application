import java.util.*;
public class CostSelling
{
    public static void main(String x[])
    {
      int cp,sp;
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter cost price");
      cp=xyz.nextInt();
      System.out.println("Enter selling price");
      sp=xyz.nextInt();

      sub=sp-cp;

      if(sub>cp)
      {
      System.out.println("got profit");
      }
      else
      {
      System.out.println("got loss");
      }
      }
}
  
