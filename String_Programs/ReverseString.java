public class ReverseString
{
    public static void main(String arg[])
    {
        String str="Vaibhav";
        char arr[]=str.toCharArray();

        int mid=arr.length/2;

        for(int i=0;i<mid;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;        // V a i b h a v 
        }

        System.out.println("!!!!!!!!!!!!!");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


    }
}