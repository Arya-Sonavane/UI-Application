import java.util.*;
public class DeleteElement
{
         public static void main(String x[])
         {
            Scanner xyz=new Scanner(System.in);
            int a[]=new int[6];
            System.out.println("Enter values in array");
            int i,no=3,index=0;
            
            for(i=0; i<(a.length-1); i++)
            {
              a[i]=xyz.nextInt();
            }
            System.out.println("Display value before sorted");

              for(i=0; i<(a.length); i++)
              {
                  System.out.println(a[i]+"\t");
              }
                for(i=0; i<a.length;i++)
                {
                     if(no==a[i])
                     {
                      index=i;
                      a[index]=0;
                     }
              }
                
                 
                  System.out.println("Display array values after delete element");
                  for(i=0;i<a.length;i++)
                  {
                    if(a[i]!=0)
                    {
                    System.out.printf(a[i]+"\t");
                    }
                  }
                     
          }
}

