import java.util.*;
public class DuplicateElements
{
     public static void main(String x[])
     {
              Scanner xyz=new Scanner(System.in);
              
              int a[]=new int[6];
              int b[]=new int[6];
              System.out.println("Enter Values");
  
              for(int i=0; i<a.length; i++)
              {
                     
                   a[i]= xyz.nextInt();
                   b[i]=a[i];
              }
                int count=0, total=0;
              for(int i=0; i<a.length; i++)
              {
                    count=0;
               for(int j=0; j<b.length; j++)
               {
                     if(a[i]==b[j])
                     {
                        count++;
                        b[j]=0;
                     }
                }
                  if(count>0)
                  {
                    System.out.println("Duplicate element" +a[i]+ "is: "+count);
		  }
                  if(count>1)
                  {
                        total++;
                  }
               }
             System.out.println("total number of duplicates are:" +total); 

      }

}