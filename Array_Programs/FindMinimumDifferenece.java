public class FindMinimumDifferenece
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{7,9,5,11,7,4,12,6,2,11};

        int n=7;
        int m=11;
        
        int count=arr.length-1;

         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]==n || arr[i]==m)
            {
                    for(int j=i+1;j<arr.length;j++)
                    {
                        if(arr[i]==7 && arr[j]==11 || arr[i]==11 && arr[j]==7)
                        {
                            if(count>(j-i))
                            {
                                count=j-i;
                            }
                        }
 
                    }

            }
         }

         System.out.println(count);
         
    }
}