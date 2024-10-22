import java.util.*;
public class SumOfMatrices
{
     public static void main(String x[])
     {
            Scanner xyz=new Scanner(System.in);
            int a[][]=new int[2][2];
            int b[][]=new int[2][2];
            int c[][]=new int[2][2];
            System.out.println("Enter values for a");

            for(int i=0; i<a.length; i++)
            {
              for(int j=0; j<a.length; j++)
              {
                  a[i][j]=xyz.nextInt();
              }

             }
            System.out.println("Enter values for b");
        
             for(int i=0; i<b.length; i++)
             {
               for(int j=0; j<b.length; j++)
               {
                   b[i][j]=xyz.nextInt();
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
            System.out.println("Second matrix");
             for(int i=0; i<b.length; i++)
             {
               for(int j=0; j<b.length; j++)
               {
                   System.out.println(b[i][j]+" ");
               }
             }
            System.out.println("Sum of two matrices ");
             for(int i=0; i<a.length; i++)
             {
                for(int j=0; j<a.length; j++)
                { 
                  c[i][j]= a[i][j]+b[i][j];
                  System.out.println(c[i][j] +" "); 
                }
             }
        }
}