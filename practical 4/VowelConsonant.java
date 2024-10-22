import java.util.*;
public class VowelConsonant
{
    public static void main(String x[])
    {
         Scanner xyz = new Scanner(System.in);
         System.out.println("Enter character");
         String value = xyz.next();
         
         char ch = value.charAt(0); 
  
         String result = ch== 'a' || ch== 'e' ||  ch== 'i' || ch== 'o' || ch== 'u'? "it is vowel" :  "it is consonant";
          System.out.println(result);
     }
}


        
         
         