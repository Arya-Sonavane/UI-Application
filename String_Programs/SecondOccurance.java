
public class SecondOccurance
{
    public static void main(String arg[])
    {
        
        String str="Vaibhbvb";

        char ch='b';

        int count=0;
        int rep=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }
            else
            {
                if(count==2)
                {
                    break;
                }
            }

            rep++;
            
        }
        System.out.println("Character Found At Index:"+rep);
    }
}