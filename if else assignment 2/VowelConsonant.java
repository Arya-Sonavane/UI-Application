import java.util.*;
public class VowelConsonant
{
    public static void main(String x[])
    {
      Scanner xyz= new Scanner(System.in);
      System.out.println("Enter alphabet");
      
      char ch = xyz.next().charAt(0);
         
     
     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
     {
       System.out.println("It is vowel");
     }
     else
     {
        System.out.println("It is consonant"); 
     }
   }
}  
      