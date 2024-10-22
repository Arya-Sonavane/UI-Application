public class PatternNo4
{
      public static void main(String x[])
      {
         for(int i=5; i>0; i--)
         {
           for(int k=5; k>i; k--)
           {
              System.out.printf(" ");
            }

       
           for(int j=1; j<=i; j++)
           {

              System.out.printf("*");
             }
            System.out.printf("\n");
         }
       }
}
