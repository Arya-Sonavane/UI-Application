import java.util.*;
class MergeTwoArray
{
  int m[];
  int n[];
  MergeTwoArray(int m[],int n[])
  {
    this.m=m;
    this.n=n;
  }
  int[] getMergeArray()
  {
    int C1=m.length;
       int C2=n.length; 
       int crr[]=new int[m.length+n.length];
       int b=0;
       for(int i=0;i<crr.length;i++)
       {
          if(i<C1)
          {
            crr[i]=m[i];
          }
          else
          {
            crr[i]=n[b];
            b++;
          }
       }

       return crr;
    }
}

public class MergeTwoArrayApp
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the size of first array:");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];
      System.out.println("Enter the elements in first array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        System.out.println("Enter the size of second array:");
        int iSize1=sobj.nextInt();

        int brr[]=new int[iSize1];
      
        System.out.println("Enter the elements in second array::");
        for(int i=0;i<brr.length;i++)
        {
            brr[i]=sobj.nextInt();
        }

     MergeTwoArray mtw=new MergeTwoArray(arr,brr);
       int drr[]=obj.getMergeArray();

        System.out.println("merge two array");
        for(int i=0;i<drr.length;i++)
        {
            System.out.println(drr[i]);
        }
     
  }

}