import java.lang.Math;
public class FindMaximumDiffereneceBetweenAnyTwoElements
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{7,9,5,6,13,2};

        int max_Diff=arr[0];
        int Diff=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    Diff=arr[j]-arr[i];
                    if(Diff>max_Diff)
                    {
                        max_Diff=Diff;
                        System.out.println(arr[i]+" "+arr[j]);
                    }
                }
            }
        }
        System.out.println(max_Diff);
    }
}