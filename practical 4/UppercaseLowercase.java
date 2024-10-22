import java.util.*;
public class UppercaseLowercase
{
    public static void main(String x[])
    {
         Scanner xyz = new Scanner(System.in);
         System.out.println("Enter character");
         String value=xyz.next();

         char ch=value.charAt(0);

         String result= ch>= 'a' && ch<='z' ? "this is Lowercase" :(ch>='A' && ch<='Z'?  "This is Uppercase":"no");
         System.out.println(result);
    }
}
         
