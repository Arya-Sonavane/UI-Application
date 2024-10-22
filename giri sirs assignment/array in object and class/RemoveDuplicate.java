import java.util.*;

class RemoveDup
{
    int m[];
    void setArray(int x[])
    {
       m=x;
    }

    // 1 2 1 3 5 2 --> 1 2 3 5

    int [] getSortArray()
    {
        for(int i=0;i<m.length;i++)
        {
            for(int j=i+1;j<m.length;j++)
            {
                if(m[i]==m[j])
                {
                    m[j]=-1;
                }
            }
        }

        int count=0;
        
        for(int i=0;i<m.length;i++)
        {
            if(m[i]!=-1)
            {
                count++;
            }
        }

        int brr[]=new int[count];
        int b=0;
        for(int i=0;i<m.length;i++)
        {
            if(m[i]!=-1)
            {
               brr[b]=m[i];
               b++;
            }
        }

        return brr;
    }
}
public class RemoveDuplicate
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

        RemoveDup obj=new  RemoveDup();

        obj.setArray(arr);

        int crr[]=obj.getSortArray();

        System.out.println("after duplicate");
        for(int i=0;i<crr.length;i++)
        {
            System.out.println(crr[i]);
        }
    }
}
