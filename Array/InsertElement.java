import java.util.*;
public class InsertElement
{
     public static void main(String x[])
     {
        Scanner xyz= new Scanner(System.in);
        int a[] = new int[6];
        System.out.println("Enter values");
        
        for(int i=0; i<(a.length); i++)
        {
           a[i]= xyz.nextInt();
        }
         System.out.println("Before Shifting");
         for(int i=0; i<a.length; i++)
         {
             System.out.printf("%d\t", a[i]);
          }
          
        System.out.println("Enter index and values");
          int index= xyz.nextInt();
          int value= xyz.nextInt();

          for(int i=(a.length-2); i>=index; i--)
          {
             a[i+1]= a[i];

          }
           a[index]= value;

          System.out.println("After Shifting");
          for(int i=0; i<a.length; i++)
          {
             System.out.printf("%d\t", a[i]);
           }
        }

}