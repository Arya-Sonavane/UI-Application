
public class RemoveFirstOccurance
{
    public static void main(String arg[])
    {
        
        String str="vaidvbhaivada";

        char ch='i';

        char arr[]=str.toCharArray();
        char brr[]=new char[arr.length-1];
  
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ch)
            {
                break;
            }
            count++;
        }

        System.out.println(count);

        int a=0;
        for(int i=0;i<arr.length;i++)
        {
           if(i==count)
           {
            continue;
           }
           brr[a]=arr[i];
           a++;
        }

        System.out.println("!!!!!!!!!!!!!!!!!");
        for(int i=0;i<brr.length;i++)
        {
            System.out.println(brr[i]);
        }

        System.out.println(brr.length);
        System.out.println(arr.length);
       
    }
}