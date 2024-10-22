public class UpperCase
{
    public static void main(String arg[])
    {
        String str="VAIBHAV";

        char arr[]=str.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>='A' && arr[i]<='Z')
            {
                arr[i]=(char)((int)arr[i]+32);
            }
        }
        ///////////////

        System.out.println("!!!!!!!!!!!!");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}