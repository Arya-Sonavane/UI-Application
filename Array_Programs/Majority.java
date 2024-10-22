public class Majority
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{4,8,4,4,4,4,6,7,8};

        int length=arr.length/2;//4 

        int i=1;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=-1)
            {
                int count=1;
                for(int j=i+1;j<arr.length;j++)
                {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]=-1;
                }
                }
             
                if(count>length)
                {
                    System.out.println(arr[i]);
                }
            
             }
        }
        

    }
}