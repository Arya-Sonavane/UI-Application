public class Fibonacci
{
  public static void main(String x[])
  {
      
   
      int n1=0;
      int n2=1;
      int n3=0;

   System.out.printf("%d %d", n1, n2);
    
   for(int i=0; i<8; i++)
   {
     n3=n1+n2;

   System.out.printf("%d", n3);

     n1=n2;
     n2=n3;

   }
  }
}