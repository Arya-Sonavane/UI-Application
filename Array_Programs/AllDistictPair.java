public class AllDistictPair
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{5,2,3,7,6,4,9,8};

        int Distinct_Sum=5;

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i+1;j<arr.length;j++)
            {
                sum=arr[j]-arr[i];
                if(Distinct_Sum==sum)
                {
                    System.out.println(arr[j]+" "+arr[i]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}