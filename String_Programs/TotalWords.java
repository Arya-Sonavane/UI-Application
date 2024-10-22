




//I am vaibhav Shete  ->space:3
// I am Vaibhav Shete ->space:5

public class TotalWords
{
    public static void main(String arg[])
    {
        String str=" Vaibhav Shete ";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
              count++;
            }
        }

        System.out.println("Total number of words->"+(count+1));

        
    }
}