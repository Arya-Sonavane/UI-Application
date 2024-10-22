import java.util.*;
public class EvenOdd
{
       public static void main(String x[])
       {
           
              
            Scanner xyz= new Scanner(System.in);
            System.out.println("Enter no");
            
            int a[]=new int[5];

	 System.out.println("enter values");
            for(int i=0; i<a.length; i++)
            {
              a[i]=xyz.nextInt();
            }
	   System.out.println("display values");
            for(int i=0; i<a.length; i++)
            {
                if(a[i]%2==0)
                {
                    System.out.print("even no:");
                    System.out.printf("%d\t" , a[i] );
                }
               else
               {
		     System.out.print("odd no:");
                    System.out.printf("%d\t" ,a[i] );

               }
             
            }
 	
        }
}