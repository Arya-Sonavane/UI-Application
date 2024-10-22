import java.util.*;
class FindMax
{
  int m[];
  void setArray(int a[])
  {
    m=a;
  }
  int getMax()
  {
    int max=m[0];
    for(int i=0; i<m.length; i++)
    {
       if(m[i]>max)
       {
          max=m[i];
       }
    }
     return max;
  }
}

public class FindMaxApplication
{
    public static void main(String x[])
    {
         FindMax fm=new FindMax();
         int a[]=new int [5];
 	 Scanner xyz=new Scanner(System.in);
         System.out.println("Enter the values in array");
         for(int i=0;i<a.length; i++)
         {a[i]=xyz.nextInt();
         }
         fm.setArray(a);
         int max=fm.getMax();
         System.out.printf("Max value is %d\n", max);
    }
}