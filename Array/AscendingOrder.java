import java.util.*;
public class AscendingOrder
{
    public static void main(String x[])
    {
           Scanner xyz=new Scanner(System.in);
           int a[]=new int[5];
           System.out.println("Enter elements in array");
           
           for(int i=0; i<a.length; i++)
           {
             a[i]=xyz.nextInt();
           }
             for(int i=0; i<a.length; i++)
             {
               for(int j=i+1; j<a.length; j++)
               {
                   if(a[i]>a[j])
                   {
                     int temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                   }    
               }

             }
          System.out.println("Ascending order elements are");
          for(int i=0; i<a.length; i++)
          {
              System.out.println(a[i] +"");
           }
      }

}