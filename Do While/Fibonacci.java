import java.util.*;
public class Fibonacci
{
   public static void main(String x[])
   {
             Scanner xyz= new Scanner(System.in);
             System.out.println("Enter No");
             int No= xyz.nextInt();
             int a=0, b=1, sum=0, i=1;

             System.out.println(a+ "" +b+ "");

             do
             {
                   sum=a+b;
                   a=b;
                   b=sum;
                   System.out.println("sum" +sum);
                   i++;
              }
            while(i<No); 


   }

}