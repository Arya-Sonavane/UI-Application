
public class FirstOccurance
{
    public static void main(String arg[])
    {
        
        String str="Vaibhav";

        char ch='b';

        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
               break;
            }
            count++;
        }
        System.out.println("Character Found At Index:"+count);
    }
}