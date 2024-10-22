public class lowerCase
{
    public static void main(String arg[])
    {
        String str="vaibhav";

        char arr[]=str.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                arr[i]=(char)((int)arr[i]-32);
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