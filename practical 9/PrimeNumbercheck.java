import java.util.*;
public class PrimeNumbercheck
{
     public static void main(String x[])
    {
          int no;
          Scanner xyz=new Scanner(System.in);
          System.out.println("Enter a number");
          no= xyz.nextInt();
          int i=1,j=2;
          boolean flag= false;
          
          while(j<=no)
          {   
                 int cnt=0;       
          while(i <= j/2)
          {
              if(j%i==0)
              {
                  cnt++;
              }
          
           
             i++;
           }
           
            String result= cnt==0? "not prime": "its a prime number"; 
            System.out.println(result+ "" +j);
            j++;
         }
     }          
       
}
