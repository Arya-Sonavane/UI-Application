import java.util.*;
public class SumOfElement
{
     public static void main(String x[])
      {
           int sum=0;
           Scanner xyz=new Scanner(System.in);
           
           int a[]={10,20,30,40,50};
           
           System.out.println("Display array values");
           for(int i=0; i<a.length; i++)
           {
            sum=sum+a[i];
            System.out.printf("%d\t", a[i]); 
            
           }
         System.out.print("Sum of all array element is:"+sum);  
      }
}