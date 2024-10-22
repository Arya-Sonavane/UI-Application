
public class ReplaceOccuranceOfCharacterWithAnother
{
    public static void main(String arg[])
    {
        
        String str="vaidvbhaivada";

        char ch='i';

        char arr[]=str.toCharArray();
        
  
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ch)
            {
                arr[i]='@';
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}