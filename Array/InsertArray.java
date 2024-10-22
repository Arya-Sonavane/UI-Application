import java.util.*;
public class InsertArray
{
         public static void main(String x[])
         {
            Scanner xyz=new Scanner(System.in);
            int a[]=new int[6];
            System.out.println("Enter values in array");
            int i,no=8,index=0;
            
            for(i=0; i<(a.length-1); i++)
            {
              a[i]=xyz.nextInt();
            }
            System.out.println("Display value before sorted");

              for(i=0; i<(a.length-1); i++)
              {
                  System.out.println(a[i]+"\t");
              }
                for(i=0; i<a.length;i++)
                {
                     if(no<a[i])
                     {
                      index=i;
                      break;
                     }
              }
                 for(i=(a.length-2); i>=index; i--)
                 {
                   if(index > 0)
                   a[i+1]=a[i];
                  }
                 index=(index==0)? index=a.length-1 : index;
                 a[index]=no;
                  System.out.println("Display array values after sort");
                  for(i=0;i<a.length;i++)
                  {
                    System.out.printf(a[i]+"\t");
                  }
                     
          }
}


                  

                 
                  
              


        

