public class FindSubArrayOfSizeK
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{1,3,6,21,4,9,12,3,16,10};

        int SubArrayLength=4;
        
        for(int i=0;i<=arr.length-SubArrayLength;i++)
        {
            int count=1;
            int result=0;
            for(int j=i;j<arr.length;j++)
            {
                
                if(arr[j]>result)
                {
                    result=arr[j];
                }
                System.out.printf("%d ",arr[j]);
                
                count++;
                {

                }
                if(count>4)
                {
                    break;
                }
            }
            System.out.printf("-->%d",result);
            System.out.println();
        }
    }
}