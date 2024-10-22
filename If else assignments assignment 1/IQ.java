import java.util.*;
public class IQ
{
    public static void main(String x[])
    {
       int XX;
       int IQ=170;
       Scanner xyz=new Scanner(System.in);
       System.out.println("enter IQ");
       XX= xyz.nextInt();

       if(XX > IQ)
       {
         System.out.println("Yes");
       }
       else
       {
         System.out.println("No");
       }
    }
}
