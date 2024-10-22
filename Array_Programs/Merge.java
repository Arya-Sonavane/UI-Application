public class Merge
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{10,20,30};
        int brr[]=new int[]{40,50,60};

        int crr[]=new int[arr.length+brr.length];
        int i=0;
        int a=0;
        for(i=0;i<crr.length;i++)
        {
            if(i<arr.length)
            {
                crr[i]=arr[i];
            }
            else
            {
                crr[i]=brr[a];
                a++;
            }
        }

        System.out.println("!!!!!!!!!");
        for(i=0;i<crr.length;i++)
        {
            System.out.println(crr[i]);
        }


    }
}