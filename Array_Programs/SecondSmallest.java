public class SecondSmallest
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{0,1,3,4,5,6,7,9};
        int i=0;
        int result=0;
        for(i=0;i<arr.length-1;i++)
        {
            int flag=1;
            for(int j=arr[i]+1;j<arr[i+1];j++)
            {
                flag=0;
                System.out.println("Second Smallest:"+j);
            }
            if(flag==0)
            {
                break;
            }
        }
    }
}
    