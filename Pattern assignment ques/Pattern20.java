public class Pattern20
{
    public static void main(String x[])
    {   
       boolean b=false;
       for(int i=1; i<=9; i++)
       {
          
         b= true;
         
         for(int j=1; j<=9; j++)
         {
           if(((j==6-i || j==4+i ) && i<=5) || (( j==i-4 || j==14-i) && i>5) &&b)
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