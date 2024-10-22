import java.util.*;

class ArrSum
{
     int b=0;
     int c=0; 
     void setValue(int base,int index)
     {
         b=base;
         c=index;
     }
     int getPower()
     {
        int result=1;
        for(int i=1;i<=c;i++)
        {
           result=result*b;   
        }

        return result;
     }
}
public class Power
{
    public static void main(String areg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter base::");
        int a=sobj.nextInt();

        System.out.println("Enter index::");
        int b=sobj.nextInt();

        ArrSum obj=new ArrSum();

        obj.setValue(a,b);


        int va=obj.getPower();
        System.out.println("Result is::"+va);
       
        
    }
}
