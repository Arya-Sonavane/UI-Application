import java.util.*;
public class ReverseNatural
{
     public static void main(String x[])
    {
          int no;
          Scanner xyz=new Scanner(System.in);
          System.out.println("enter no");
          no=xyz.nextInt();

         int i= no;
         while(i>=1)
         {
            System.out.println(i + "");
            i--;
         }
    }
}