public class Pattern19
{
    public static void main(String x[])
    {   
       boolean b=false;
       for(int i=1; i<=10; i++)
       {
          
         b= true;
         
         for(int j=1; j<=9; j++)
         {
           if(((j>=6-i && j<=4+i && i<=6) || (j>=i-5 && j<=16-i && i>6))&&b)
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