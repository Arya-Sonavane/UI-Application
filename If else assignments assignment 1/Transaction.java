import java.util.*;
public class Transaction
{
    public static void main(String x[])
     {
        int WA;
        double B=2000;
        Scanner xyz=new Scanner(System.in);
        System.out.println("withdraw amt");
        WA=xyz.nextInt();
        
        if(WA%5==0)
        {
                double total=WA+0.50;
                System.out.println("withdraw amt" +total);
                if(B > total)
                {
                B=B-total;
                System.out.println("Transaction successed  " +B);
             }
              else
             {
                System.out.println("balance not sufficient");
             }
       }
       else
       {
           System.out.println("amt is multiple of 5");
       }
    }
                  
         
}      
                
        
        