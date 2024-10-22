import java.util.*;
public class Alphabet
{
   public static void main(String x[])
   {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the character");
        ch = xyz.next();

        result= (ch>= 'A' && ch<= 'Z') || (ch>= 'a' && ch<= 'z') ? "ch is an alphabet" :  "ch is not an alphabet";
        System.out.println(result);
   }
}