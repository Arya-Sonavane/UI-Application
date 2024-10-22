public class Pattern34
{
      public static void main(String x[])
      {
           for(int i=1; i<=4; i++)
           {
              for(int j=1; j<=7; j++)
              {
                  if((j==5-i || j==8-i) || (i==1 && j>=4 && j<=7) || (i==4 && j>=2 && j<=4))
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