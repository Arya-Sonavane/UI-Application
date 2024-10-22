public class CreateByteArray
{
    public static void main(String arg[])
    {
        String str="vaibhav";

        byte arr[]=str.getBytes(); // create byte code

        String one = new String(arr);

        System.out.println(one);
    }
}