public class CountTotalWords
{
    public static void main(String arg[])
    {
        String str=" vaibhav shete I am Good  ";
        
        System.out.println(str.length());

        int count=0;

        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        System.out.println(count);

    }
}


// Brest Approach