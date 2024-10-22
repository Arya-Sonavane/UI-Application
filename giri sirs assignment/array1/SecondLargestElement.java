import java.util.*;
public class SecondLargestElement
{
     public static void main(String x[])
     {
               Scanner xyz= new Scanner(System.in);
                int a[]= new int[5];
                System.out.println("enter elements");
                for(int i=0; i<a.length; i++)
                {
                    a[i]= xyz.nextInt();
                }
           
               
               for(int i=0; i<a.length; i++)
               {
                   int max=i;
                   for(int j=i+1; j<a.length; j++)
                   {
                      if(a[j] <a[max])
                      {
                         max= j;
                      }

                      if(max!=i)
                      {
                         int temp= a[i];
                         a[i] = a[max];
                         a[max]= temp;
                      }
                   }
               }
                   
           System.out.printf("second largest element is: %d" , a[3]);
	   System.out.printf("\nsecond smallest element is: %d" , a[1]);             
       }                                                                  
		
} 