import java.util.*;
public class OddNumber
{
       public static void main(String x[])
       {
            int no;
            Scanner xyz= new Scanner(System.in);
            no = xyz.nextInt();
            int i =1;
 
            while(i<=100)
            {
              if(i%2!=0)
		{
                 System.out.println("Odd no is"+ i);
                }
              i++;
             }
          }
}