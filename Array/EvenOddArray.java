import java.util.*;
public class EvenOddArray
{
     public static void main(String x[])
     {
             Scanner xyz= new Scanner(System.in);
             int c[]= new int[5];
             int Even[]= new int[5];
             int Odd[]= new int[5];
              
           
               System.out.println("enter values");
                for(int i=0; i<c.length; i++)
                {
                    c[i]= xyz.nextInt();
                   
                }             

             for(int i=0; i<c.length; i++)
             {

               if(c[i]%2==0)
                {
                  Even[i]=c[i];
                }
               else
               {
                 Odd[i]=c[i];
               }
             }
           System.out.print("Even Array: ");
             for(int i=0; i<Even.length; i++)
             {
               System.out.print((Even[i]>0)? Even[i]+"\t":"");
             }
           System.out.print("\nOdd Array: ");
              for(int i=0; i<Odd.length; i++)
             {
               System.out.print((Odd[i]>0)? Odd[i]+"\t":"");
             }
       }
}
               
   
             
