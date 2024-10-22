import java.util.*;
public class UnsortedList
{
         public static void main(String x[])
         {
            Scanner xyz=new Scanner(System.in);
            int a[]=new int[6];
            System.out.println("Enter values in array");
            int index=0;
            
            for(int i=0; i<(a.length-1); i++)
            {
              a[i]=xyz.nextInt();
            }
            System.out.println("Enter index and value");
             
              int no=xyz.nextInt();

              for(int i=0; i<(a.length-1); i++)
              {
                if(no<a[i])
                {
                      index=i;
                      break;
                 }
              }
                 for(int i=(a.length-2); i>=index; i--)
                 {
                   a[i+1]=a[i];
                  }
                 a[index]=no;
                  System.out.println("Display array values after insert it\n");
                  for(int i=0;i<a.length;i++)
                  {
                    System.out.printf("a[%d] %d\n",i,a[i]);
                  }
                     a[index]=no;
          }
}


                  

                 
                  
              


        
