public class SecondLargest  //Without using asending or desecnding order
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{2,9,1,4,6};

        int max=arr[0];
        int i=0;
        for(i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        
      
        int max1=arr[0];
        for(i=0;i<arr.length;i++)
        {
            if(max1<arr[i] && arr[i]!=max)
            {
                max1=arr[i];
            }
        }

        
        System.out.println(max1);

    }
}
