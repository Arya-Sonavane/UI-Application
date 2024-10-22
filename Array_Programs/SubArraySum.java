public class SubArraySum
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{7,4,-7,1,3,3,1,-4};
        int sum=7;
        for(int i=0;i<arr.length;i++)
        {
            int current_sum=arr[i];
            if(current_sum==sum)   // Explicite Condition
            {
                System.out.println(i);
            }
            for(int j=i+1;j<arr.length;j++)
            {
               current_sum=current_sum+arr[j];
               if(current_sum==sum)
               {
                 System.out.println(i+" "+j);
               }
            }
        }
    }
}