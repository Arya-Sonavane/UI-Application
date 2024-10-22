public class MissingElement
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{1,5,9,13,17};
        int i=0;
        for(i=0;i<arr.length-1;i++)
        {
            for(int j=arr[i]+1;j<arr[i+1];j++)
            {
                System.out.println(j);
            }
        }
    }
}
