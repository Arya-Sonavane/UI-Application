import java.util.*;
public class EqualArray
{
      public static void main(String x[])
      {
              Scanner xyz=new Scanner(System.in);
              int a[]= new int[5];
              int b[]= new int[5];
             System.out.println("Enter value for a");
             for(int i=0; i<a.length; i++)
             {
               a[i]=xyz.nextInt();

             }
            System.out.println("Enter value for b");
             for(int i=0; i<b.length; i++)
             {
               b[i]=xyz.nextInt();

             }
              boolean flag= true;
              if(a.length == b.length)
              {
                 for(int i=0; i<a.length; i++)
                 {
                   if(a[i]!=b[i])
                   {
                     flag=false;
                     break;
                   }
                 }
              System.out.println((flag)?"Yes Array is equal" : "No Array is not equal");  
              }
           
            

      }
}