 class FindSum
 {
   int sum=0;
    
   void sum(int....x)//method with variable arguments
   
   for(int i=0; i<x.length; i++)
   {

   sum=sum+x[i];
   
   }
   System.out.printf("sum of numbers ",+sum);
  
  }
 
 }

public class FindingSum
{
  public static void main(String x[])
  {
    FindSum f=new FindSum();

    f.sum(10,20,30,40,50);
  }
}