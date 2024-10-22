public class Pattern31
{
        public static void main(String x[])
        {
                for(int i=1; i<=9; i++)
                {
                    for(int j=1; j<=9; j++)
                    {
                         if(i==5 || j==4+i || j==14-i )
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