public class Pattern26
{
   public static void main(String x[])
   {
       for(int i=1; i<=7; i++)
       { int c=1;
        for(int j=1; j<=7;j++)
        {
          if(j<=i)
           {
              System.out.printf("%d", c);
               c=c*(i-j)/j;
           }

        }
            System.out.printf("\n");
          


       }


   }

} 