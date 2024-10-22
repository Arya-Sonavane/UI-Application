public class TrimLeadingWhiteSpace
{
    public static void main(String arg[])
    {
        String str="   Vaibhav Shete";


        char arr[]=str.toCharArray();
       
        int i=0;
        int count=0;
        for(i=0;i<str.length();i++)
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
        int a=0;
        for(i=count;i<arr.length;i++)
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