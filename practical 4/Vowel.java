import java.util.*;
public class VowelConsonant
{
    public static void main(String x[])
    {
         Scanner xyz = new Scanner(System.in);
         System.out.println("Enter a letter");
         char letter = xyz.next().charAt(0);
         char lowerCaseLetter = Character.toLowerCase(letter); 
  
         String result = (lowerCaseLetter == 'a' || lowerCaseLetter == 'e' || lowerCaseletter == 'i' || lowerCaseLetter == 'o' || lowerCaseLetter == 'u')? "vowel" :       "consonant";
          System.out.println(result);
     }
}


        
         
         