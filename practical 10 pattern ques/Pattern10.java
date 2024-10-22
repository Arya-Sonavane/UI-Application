public class Pattern10
{
  public static void main(String x[])
  {
         for(int i=5; i>0; i--)
         {
           for(int j=9; j>0; j--)
          {
            if(j>=6-i && j<=4+i)
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
           
