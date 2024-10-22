public class Pattern13//hollow full pyramid
{
    public static void main(String x[])
    {
            boolean b= false;

          for(int i=1; i<=5; i++)
          {
             int num= 1;
             b= true;
     
           for(int j=1; j<=9; j++)
           {
             if((i==5 || j==6-i || j==4+i) && b)
             {
               if(i==3 && j==7)
               {
                 num=3;
                 System.out.print(num);
                }
                else if (i==4 && j==8)
                {
                  num=4;
                  System.out.print(num);
                }else
                 {
                  
                System.out.print(num);
                 num++;
                 }
                  b= false;
                 }
                 else
                 {
                     
                  System.out.printf(" ");
                   b= true;
               }

               System.out.printf("\n");
           }
          
     }
              
}
      
}