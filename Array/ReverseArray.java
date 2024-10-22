import java.util.*;
public class ReverseArray
{
    public static void main(String x[])
    {
           Scanner xyz=new Scanner(System.in);
           System.out.println("enter elements in array");
           int a[]=new int[5];

           for(int i=0; i<a.length; i++)
           {
               a[i]=xyz.nextInt();
           }
             System.out.println("Array Elements");
           for(int i=0; i<a.length; i++)
           {
               System.out.println(a[i]+ " ");
           }
             System.out.println("Reverse array is");
           for(int i=a.length-1; i>=0; i--)
           {
               System.out.println(a[i]+ " ");
           }
    }
}