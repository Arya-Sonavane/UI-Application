
public class OccuranceOfCharacter
{
    public static void main(String arg[])
    {
        
        String str="vaivbhav";

        char ch='v';

        char arr[]=str.toCharArray();
        
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==ch)
           {
            count++;
           }
        }
        System.out.println(count);
    }
}