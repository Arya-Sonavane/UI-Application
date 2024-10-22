public class CreatingStringObject
{
    public static void main(String arg[])
    {
        char arr[]=new char[]{'v','a','i','b','h','a','v'};

        String str=String.copyValueOf(arr,0,7);

        System.out.println(str);
    }
}