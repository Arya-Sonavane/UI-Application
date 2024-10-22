public class Pattern24
{
    public static void main(String x[])
    {
       
        int no1=1, no2=1, no3=4;
        for(int i=1; i<=8; i++)
        {
          for(int j=1; j<=no1; j++)
          {
             if(no1>=j && i<=4)
             {
               System.out.print((j%2==0)? "*" : no2);

             }else
              if(j<=12-i && i>=5)
              {
                System.out.print((j%2==0)? "*": no3 );
              }
            }
             if(no1<7 && i<5)
             {
                no1+=2;
                no2++;
             }             
             else
             if(i>=5)
             {
               no1=no1-no2;
               no3--;
             }
            System.out.printf("\n");
        }
            
         }
