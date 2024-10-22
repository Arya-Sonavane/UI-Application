public class MoveAllZeroAtEnd
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{2,5,7,0,4,0,7,-5,8,0};

        int left=0;
        int right=arr.length-1;

        while(left<right)
        {
            if(arr[left]==0 && arr[right]!=0)
            {
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;

                left++;
                right--;
            }
            else if(arr[left]!=0)
            {
                left++;
            }
            else if(arr[right]==0)
            {
                right--;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}


// another method is to copy non zero element into another array