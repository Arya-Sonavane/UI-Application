import java.util.*;
public class PrimeNumber
{
     public static void main(String x[])
    {
          int no;
          Scanner xyz=new Scanner(System.in);
          System.out.println("Enter a number");
          no= xyz.nextInt();
          int i=1;
          boolean flag= false;
          
          
          while(i <= no/2)
          {
              if(no %i==0)
              {
              flag=true;
              break;
         }
          
           
             i++;
           }
           
            String result= !flag? "not prime": "its a prime number"; 
            System.out.println(result);
     }          
       
}

             
            
         
        
          
          


          

          