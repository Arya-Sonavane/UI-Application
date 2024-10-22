import java.util.*;
public class DescendingOrder
{
      public static void main(String x[])
      {
                Scanner xyz=new Scanner(System.in);
                int a[]=new int[3];
                int b[]=new int[3];
                int c[]=new int[a.length + b.length];
                System.out.println("Enter values in matrix");
                
                int  k=0;
		System.out.println("enter value for a");
                for(int i=0; i<a.length; i++)
                {
                    a[i]= xyz.nextInt();
                    c[k]=a[i];
                    k++;
                }
		System.out.println("enter value for b");
                for(int j=0; j<b.length; j++)
                {
                    b[j]=xyz.nextInt();
                    c[k]=b[j];
                    k++;
                 }
		 
     		System.out.println("without sort");
                  for( k=0; k<c.length; k++ )
                  {
                     System.out.printf("%d\t",c[k]);
                  }
                for(int i=0; i<c.length; i++)
                {
                     int max=i;
                  for(int j=i+1; j<c.length; j++)
                   {
                       if(c[j]>c[max])
                       {
                          max=j; 
                        }
                       if(max!= i)
                        {
                            int temp=c[i];
                            c[i]=c[max];
                            c[max]= temp;  
                        }   
                     }
                 }

		   System.out.println("\nwith sort");
                    for( k=0; k<c.length; k++ )
                   {
                      System.out.printf("%d\t",c[k]);
                   }   
                     
                }

                  
          }



