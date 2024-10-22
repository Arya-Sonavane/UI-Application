import java.util.*;
public class Lcm
{
  public static void main(String x[])
  {
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter two no1:");
     int n1=xyz.nextInt();
     System.out.println("Enter two no2:");
     int n2=xyz.nextInt();
   
    int lcm=1;
    while(true)
    {
      if(lcm%n1==0 && lcm%n2==0)
      {
         break;
      }
     lcm++;
    }
  System.out.print("lcm ");
  }

}
