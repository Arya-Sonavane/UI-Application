public class FindMaximumRepeatingNumber
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{2,3,3,5,3,4,1,7,7,7,7};
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
           
                int count=1;
                if(arr[i]!=-1)
                {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                        arr[j]=-1;
                    }
                }
                if(result<count)
                {
                    result=count;
                }
               }  
        }
        System.out.println(result);
    }
}