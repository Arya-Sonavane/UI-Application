public class Pattern22
{
     public static void main(String x[])
     {    
         int count=3;
         for(int i=1; i<=7; i++)
         {  

           for(int j=1; j<=4; j++)
           {
             if((i>=j && i<=4)||( j<=8-i && i>=4))
             {
               System.out.print(count);
               
              }
             else
              {
                System.out.printf(" ");
               }
           }
              
         System.out.printf("\n");
            if(i<4)
            {
             count++;
            }
            else
            {
             count--;
            }
          }
              



      }
}
