import java.util.*;
public class ReverseNumber
{
     public static void main(String x[])
    {
          int no,rem, reverse = 0;
          Scanner xyz=new Scanner(System.in);
          System.out.println("enter no");
          no=xyz.nextInt();

          while(no!=0)
          { rem=no%10;
          reverse= reverse*10 + rem;
          no=no/10;
        }
      System.out.println("reverse "+reverse);
    }

    
}
          
          

          
      
          