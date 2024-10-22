public class PalindromeString
{
    public static void main(String arg[])
    {
        String str="madam";

        char arr[]=str.toCharArray();

        boolean flag=true;
        int mid=arr.length/2;
        for(int i=0;i<mid;i++)
        {
            if(arr[i]!=arr[arr.length-i-1])
            {
                flag=false;
                break;
            }
        }

        System.out.println(flag);
       
    }
}