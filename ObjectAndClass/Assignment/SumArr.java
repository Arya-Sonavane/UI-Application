import java.util.*;

class ArrSum
{
    int m[];
    void setValue(int x[])
    {
        m=x;
    }

    
    class getSum{
        int getArrSum()
        {
            int sum=0;
            for(int i=0;i<m.length;i++) 
            {
               sum+=sum+m[i];
            }

            return sum;
          }
        
    }
}
public class SumArr
{
    public static void main(String areg[])
    {
        Scanner xyz=new Scanner(System.in);

        System.out.println("Enter the size of first array:");
        int size=xyz.nextInt();

        int arr[]=new int[size];
      
        System.out.println("Enter the elements in first array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=xyz.nextInt();
        }

      

        ArrSum obj=new ArrSum();

        obj.setValue(arr);

        ArrSum.GetSum obj1=obj.new GetSum();
        int result=obj1.getArrSum();
        System.out.println("The Sum"+result);
        
    }
}
