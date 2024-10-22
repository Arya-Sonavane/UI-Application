import java.util.*;
public class AlphabetDigit
{
    public static void main(String x[])
    {
         Scanner xyz = new Scanner(System.in);
         System.out.println("Enter character");
         String value=xyz.next();

         char ch=value.charAt(0);

         String result= ch>= 'a' && ch<='z' ? "this is alphabet" :(ch>='0' && ch<='9' ? "It is number" : "It is Special character");
         System.out.println(result);
     }
}