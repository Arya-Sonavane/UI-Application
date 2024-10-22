public class Pattern7
{
   public static void main(String x[])
   {
        boolean b=false;
        for(int i=6; i>0; i--)
        {
          b= true;
         for(int j=11; j>0; j--)
         { 
           if((j>=7-i && j<=5+i) && b)
           {
              System.out.printf("*");
              b= false;

            }
            else
            {
              System.out.printf(" ");
              b= true;
             }
           }
              System.out.printf("\n");

        }


    }






 }