public class Ceiling
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{1,3,4,7,8,9,9,10};

        int ceiling=5;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ceiling)
            {
                System.out.println("ceiling is "+ ceiling);
            }
            else
            {
                if(arr[i]>ceiling)
                {
                    ceiling=arr[i];
                    break;
                }
            }
        }
        System.out.println(ceiling);
    }
}