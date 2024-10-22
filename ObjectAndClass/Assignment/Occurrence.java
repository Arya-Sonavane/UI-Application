import java.util.*;

class occur
{
    int m[];
    void setArray(int x[])
    {
        m=x;
    }

    void getoccurrence()
    {
        // 1 1 2 3 2 => (1)->2 (2)->2 (3)->1
        
        for(int i=0;i<m.length;i++)
        {
            int count=1; 
            if(m[i]!=-1)
            {
                for(int j=i+1;j<m.length;j++)
                {
                if(m[i]==m[j])
                {
                    count++;
                    m[j]=-1;
                }
                }
           }
            System.out.println("!!!!!!!!!!!!!!!");
            System.out.println(count);
        }


    }
}
public class Occurrence
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

        occur obj=new occur();

        obj.setArray(arr);

        obj.getoccurrence();
    }
}
