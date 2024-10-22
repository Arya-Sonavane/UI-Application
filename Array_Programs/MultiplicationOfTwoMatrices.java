
import java.util.*;
public class MultiplicationOfTwoMatrices
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int arr[][]=new int[2][2];
       

        int i=0;
        int j=0;
        for( i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sobj.nextInt();
            }
        }

        for( i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
               System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }

        int brr[][]=new int[2][2];

        for( i=0;i<brr.length;i++)
        {
            for(j=0;j<brr[i].length;j++)
            {
                brr[i][j]=sobj.nextInt();
            }
        }

        for( i=0;i<brr.length;i++)
        {
            for(j=0;j<brr[i].length;j++)
            {
               System.out.printf("%d ",brr[i][j]);
            }
            System.out.println();
        }


       int crr[][]=new int[2][2];
       int sum=0;
       int a=0;
       int b=0;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length;j++)
            {
                crr[i][j]=sum+arr[i][j]*brr[j][b];
            }
            
           
        }

        for(i=0;i<crr.length;i++)
        {
            for(j=0;j<crr[i].length;j++)
            {
                System.out.printf("%d ",crr[i][j]);
            }
            System.out.println();
            
        }

    }
}