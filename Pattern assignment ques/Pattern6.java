public class Pattern6 //full pyramid
{
   public static void main(String x[])
   {
        boolean b=false;
        for(int i=1; i<=6; i++)
        {
          b= true;
         for(int j=1; j<=11; j++)
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
