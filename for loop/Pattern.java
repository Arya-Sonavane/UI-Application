public class Pattern
{
      public static void main(String x[])
     {
            
           int i,j;
           for(i=1; i<=5 ; i++)
           {
               System.out.printf("%d ",i);
              
               for(j=4; j>=1; j--)
               {
                   if( i==5)
                 {
                  System.out.printf("%d ",j);
               }
          }
                
                System.out.println("\n");
           }
     }
       
}
                   