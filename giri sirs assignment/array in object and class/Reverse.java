import java.util.*;

class ReverseApp
{
    int m[];
    void setArray(int x[])
    {
        m=x;
    }

    int [] getSortArray()
    {

        //Reverse logic

        int min=m.length/2;
        for(int i=0;i<min;i++)
        {
           int temp=m[i];
           m[i]=m[m.length-i-1];
           m[m.length-i-1]=temp;
        }

        System.out.println("Display value before insert");
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }
        //sorting logic

        for(int i=0;i<m.length;i++)
        {
            for(int j=i+1;j<m.length;j++)
            {
                if(m[i]>m[j])
                {
                int temp=m[i];
                m[i]=m[j];
                m[j]=temp;
                }
            }
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }

        return m;
        
    }
}
public class Reverse
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


        ReverseApp obj=new ReverseApp();
        obj.setArray(arr);
        int brr[]=obj.getSortArray();

        System.out.println("!");
        for(int i=0;i<brr.length;i++)
        {
            System.out.println(brr[i]);
        }

        
        
    }
}
