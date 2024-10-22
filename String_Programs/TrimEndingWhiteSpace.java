public class TrimEndingWhiteSpace
{
    public static void main(String arg[])
    {
        String str="Vaibhav shete  ";

        char arr[]=str.toCharArray();
       
        int i=0;
        int count=0;
        for(i=arr.length-1;i>=0;i--)
        {
           if(str.charAt(i)==' ')
           {
              count++;
           }
           else
           {
              break;
           }
        }

        char brr[]=new char[arr.length-count];
        int end=arr.length-count;
        int a=0;
        for(i=0;i<end;i++)
        {
           brr[a]=arr[i];
           a++;
        }

        for(i=0;i<brr.length;i++)
        {
            System.out.println(brr[i]);
        }
    }
}