import java.util.*;

class FindEvenOdd
{
    int m[];
    void setArray(int a[])
    {
      m=a;
    }
    void minArray()
    {
       int Min=m[0];
       for(int i=0;i<m.length;i++)
       {
          if(Min>m[i])
          {
            Min=m[i];
          }
       }

       System.out.println("MIN->"+Min);
    }
    void maxArry()
    {
       int Max=m[0];
       for(int i=0;i<m.length;i++)
       {
          if(Max<m[i])
          {
            Max=m[i];
          }
       }

       System.out.println("MAX->"+Max);
    }
}
public class EvenOdd
{
    public static void main(String areg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of first array:");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];
      
        System.out.println("Enter the elements in first array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        FindEvenOdd obj=new FindEvenOdd();
        obj.setArray(arr);
        obj.minArray();
        obj.maxArry();
    }
}
