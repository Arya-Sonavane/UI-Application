public class Pattern28
{
    public static void main(String x[])
    {
       for(int i=1; i<=5; i++)
       {
          for(int j=1; j<=5; j++)
          {
            if(j<=6-i && i>5)
            {
              System.out.printf("*");
            }
             else
             {
               System.out.printf(" ");
             }

         }
              
       }
            
    }

}