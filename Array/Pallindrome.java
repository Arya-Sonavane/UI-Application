import java.util.*;
public class Pallindrome
{
   public static void main(String x[])
   {
            int a[]=new int[5];
            int b[]=new int[5];

            Scanner xyz=new Scanner(System.in);
            System.out.println("Enter values in array");
            for(int i=0; i<a.length; i++)
            {
               a[i]= xyz.nextInt();
            }
            
            for(int i=0; i<a.length; i++)
            {
               b[i]= a[i];
            }
             
             int mid = a.length/2;
             int end = a.length-1;

            for(int i=0; i<mid; i++)
            { int temp=a[i];
              a[i]=a[end];
              a[end]=temp;
              end--;
            }

            boolean flag = true;
            for(int i=0; i<a.length; i++)
            {
              if(a[i]!=b[i])
              {
               flag= false;
               break;
              }
              
            }
             if(flag)
             {

                System.out.println("Pallindrome number");
             }
             else
             {
                System.out.println("not pallindrome number");
             }
                


       }
        
            
 }

