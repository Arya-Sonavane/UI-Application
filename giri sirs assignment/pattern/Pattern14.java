public class Pattern14//hollow inverted half
{
     public static void main(String x[])
     {
           for(int i=1; i<=5; i++)
           {
             int num=i ;
              for(int j=1; j<=5; j++)
              {
                if(i==1 || j==1|| j==6-i)
                {
                  System.out.print(num);
                  num++;
                }
                else
                {
                  System.out.printf(" ");
                  num++;
                }
              }
                  System.out.printf("\n");
              }
            }
}

                
              