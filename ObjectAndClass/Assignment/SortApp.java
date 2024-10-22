import java.util.*;

class SortArr
{
   int m[];
   void setArray(int x[])
   {
      m=x;
   }
   
   int [] getSortArray()
   {
       
       for(int i=0;i<m.length;i++)
       {
            for(int j=i+1;j<m.length;j++)
            {
                if(m[i]<m[j])
                {
                    int temp=m[i];
                    m[i]=m[j];
                    m[j]=temp;
                }
            }
       }

       return m;
   }
}
public class SortApp
{
    public static void main(String args[])
    {
        Scanner xyz=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int iSize=xyz.nextInt();

        int arr[]=new int[iSize];
      
        System.out.println("Enter the elements in array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=xyz.nextInt();
        }

        // class object creation

        SortArr obj=new SortArr();

        obj.setArray(arr);

        int brr[]=obj.getSortArray();

        //Printing sorted array

        System.out.println("Sorted Array");
        for(int i=0;i<brr.length;i++)
        {
            System.out.println(brr[i]);
        }
    }
}