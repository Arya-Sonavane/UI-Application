import java.util.*;
class CheckChar
{
  char c;
 void setChar(char ch)
 {
    c=ch;
 }
  boolean checkChar()
  {
    if(c>='a'&& c<='z'|| c>='0'&& c<='9')
    {
         return true;

    }
    else
    {
      return false;
       
    }
      
  }  


}

public class CheckCharApp
{
   public static void main(String x[])
   {
        Scanner xyz=new Scanner(System.in);

        System.out.println("Enter character");
         String value=xyz.next();

        char ch=value.charAt(0);
          
        CheckChar c= new CheckChar();
        c.setChar(ch);
        boolean b=c.checkChar();
	if(b){
	 System.out.println("Character");
         }
         else
         {
	   System.out.println("digit");
      }

   }

}

