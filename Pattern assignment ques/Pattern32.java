public class Pattern32
{
    public static void main(String x[])
    {
          for(int i=1; i<=9; i++)
          {
             for(int j=1; j<=9; j++)
             {
               if(i==5 || j==6-i || (i==4+j && i>5))
               {
                   System.out.printf("*");
               }
               else
               {
                   System.out.printf(" ");
               }
             }
               System.out.printf("\n");
          }
     }

}