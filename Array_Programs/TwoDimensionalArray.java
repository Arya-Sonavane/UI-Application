import java.util.*;
public class TwoDimensionalArray
{

    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int arr[][]=new int[3][3];

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

        
    }
}