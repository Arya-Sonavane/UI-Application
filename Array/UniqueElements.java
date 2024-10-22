import java.util.*;
public class UniqueElements
{
     public static void main(String x[])
     {
              Scanner xyz=new Scanner(System.in);
              
              int a[]=new int[6];
              System.out.println("Enter Values");
 
              for(int i=0; i<a.length; i++)
              {
                   a[i]= xyz.nextInt();
              }
                
              for(int i=0; i<a.length; i++)
              {
                 int count=0;   
               for(int j=0; j<a.length; j++)
               {
                     if(a[i]==a[j])
                     {
                        count++;
                     }
                }
                 if(count==1)
                 {
                      
                   System.out.println("Unique elements is" +a[i]);
                 }
              }
              

      }

}
