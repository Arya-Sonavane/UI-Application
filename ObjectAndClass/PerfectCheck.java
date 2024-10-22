import java.util.Scanner;
class CheckPerfect
{
   int no;
   void setValue(int num)
   {
     no=num;
   }
 
  boolean CheckPerfectNumber()
  {
    int sum=0, i=1;
    
   while(i<no)
   {
       if(no%i==0)
       {
          sum=sum+i;
       }
         i++;
    }
      return sum;
  }
}


public class PerfectCheckk
{
   public static void main(String x[])
   {
        Scanner xyz= new Scanner(System.in);
        System.out.println("Enter number");
        int no=xyz.nextInt();

        
    
     CheckPerfect p=new CheckPerfect();
     p.setValue(no);
     int sum=0;
     if(sum==0)
     {
       System.out.println("It is perfect no:"+ p.CheckPerfectNumber());
     }
    else
    {
       System.out.println("It is not pefect no"+ p.CheckPerfectNumber());
    }
  }
}

     
   