public class Pattern27No
{
    public static void main(String x[])
    {
         for(int i=1; i<=10; i++)
         {
           for(int j=1; j<=10; j++)
           {
             if((j<7-i || j>=5+i) || (i>=5+j || j>=16-i ))
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