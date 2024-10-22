import java.util.*;
public class SwapNumber
{
     public static void main(String x[])
     {
          Scanner xyz= new Scanner(System.in);
          int no,last,first;
          System.out.println("Enter Number");
          no= xyz.nextInt();
          

          System.out.printf("Before swaping number %d\n",no);
          last=no%10;
          first=no/10;

          no=no/10;
          no=no%100;
          last=last*100;
          no= last+(no*10)+first;

          System.out.printf("After swap digit %d\n",no);
       }
}

         
          

          
          
