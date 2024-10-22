import java.util.*;
public class SumOfDiagonal
{
     public static void main(String x[])
     {
            Scanner xyz=new Scanner(System.in);
            System.out.println("Enter size of array");
            int n=xyz.nextInt();
            int a[][]=new int[n][n];
            
            
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
         
            
            int sum=0;
             for(int i=0; i<a.length; i++)
             {
                for(int j=0; j<a.length; j++)
                { 
                  if(i==j)
                  {
                    sum =sum + a[i][j];
                  }
            
                }
              
             }
             System.out.println("sum of diagonal::"+sum);
              
        }
}