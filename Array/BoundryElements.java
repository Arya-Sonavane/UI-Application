import java.util.*;
public class BoundryElements
{
     public static void main(String x[])
     {
            Scanner xyz=new Scanner(System.in);
            int a[][]=new int[3][3];
            
            
            System.out.println("Enter values for a");

            for(int i=0; i<a.length; i++)
            {
              for(int j=0; j<a.length; j++)
              {
                  a[i][j]=xyz.nextInt();
              }

             }
     
            System.out.println("First matrix");
              for(int i=0; i<a.length; i++)
             {
              for(int j=0; j<a.length; j++)
              {
                System.out.println(a[i][j] +" ");
              }

             }
           for(int i=0; i<a.length; i++)
           {
             for(int j=0; j<a.length; j++)
             {
               if(i==1 && j==1)
               {
                 System.out.print("  ");
               }
                else
                {
                 System.out.print(a[i][j]+ " "); 
                }
            }
              System.out.println();
          }
               
          }
     }
         
