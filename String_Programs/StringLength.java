
import java.util.*;

public class StringLength
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the String::");
        String str=sobj.nextLine();
        System.out.println(str);

        int count=0;
        for(int i=0;i<str.length();i++)
        {
            
            count++;
            
        }
        System.out.println(count);
    }
    
}
