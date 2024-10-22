import java.util.*;

public class CopyString
{
    public static void main(String arg[])
    {
        String str="Vaibhav Shete";
        char arr[]=str.toCharArray();
        
        for(int i=0;i<arr.length;i++)
        {
           System.out.println(arr[i]);
        }

        String copy=new String(arr);    // Using String class Constructor ( Char arr converted into String).

        System.out.println(copy);
 
    }
}