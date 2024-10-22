public class ConvertArray
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{0,3,3,3,0,0,7,7,0,9};

        int i=0;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=0)
            {
              if(arr[i]==arr[i+1])
              {
                 arr[i]=arr[i]+arr[i+1];
                 arr[i+1]=0;
              }
            } 
        }

        int a=0;
        int brr[]=new int[arr.length];
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                brr[a]=arr[i];
                a++;
            }
        }

        for(i=0;i<brr.length;i++)
        {
            System.out.println(brr[i]);
        }
    }
}