//! Inversion means : An inversion is a pair of elements where the first element is greater than the second element and appears before it in the array. The program should identify and count all such pairs, then display both the inversions and their total count.

public class Inversion
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{1,9,6,4,5};
        
        for(int i=0;i<arr.length-1;i++)
        {
            
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}