import java.util.*;
public class MaxMin
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
 		System.out.print("max" +max );  
	     System.out.print( "min" +min);
        }
}