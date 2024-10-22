
import java.util.*;
public class Character
{
    public static void main(String x[])
    {
      String s;
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter no");
      s=xyz.next();
      char ch= s.charAt(0);
     if(ch>='a' && ch<='z' || ch>='A' && ch>='Z')
      {
        System.out.println("This is an alphabet");
      }
      else
      {
        System.out.println("This is not an alphabet");
      }
       }
} 