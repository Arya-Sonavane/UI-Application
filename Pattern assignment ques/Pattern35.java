public class Pattern35
{
     public static void main(String x[])
     {  boolean b= false;
        int Num = 1;
        for(int i=1; i<=4; i++)
        {  
           b=true;
          for(int j=1; j<=11; j++)
           {
               if((j>=7-i && j<=5+i) && b)
               {
                  System.out.print(Num++);
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