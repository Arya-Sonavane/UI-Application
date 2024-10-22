import java.util.*;
public class MaximumMinimum
{
       public static void main(String x[])
       {
            int max=0;
            int min=0;
            Scanner xyz= new Scanner(System.in);
            int a[]=new int[5];

	 System.out.println("enter values");
            for(int i=0; i<a.length; i++)
            {
              a[i]=xyz.nextInt();
            }
	   System.out.println("display values");
            for(int i=0; i<a.length; i++)
            {
                if(a[i]>max)
                {
                    max=a[i];
                }
               else
               {
                    min=a[i];

               }
             
            }
 		System.out.print("maximum element in array:" +max );  
	     System.out.print( "\nminimum elemenet in array:" +(a.length-1));
        }
}