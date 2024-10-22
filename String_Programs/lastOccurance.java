
public class lastOccurance
{
    public static void main(String arg[])
    {
        
        String str="vaibhaviab";

        char ch='v';

        int length=str.length();
        int count=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            count++;
           if(str.charAt(i)==ch)
           {
             break;
           }
           
        }

        System.out.println(count);

        System.out.println("Last Occurance OF Character is->>>"+(length-count));
    }
}