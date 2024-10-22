
public class RemoveAllOccurance
{
    public static void main(String arg[])
    {
        
        String str="vaidvbhaivada";

        char ch='i';

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

        char brr[]=new char[arr.length-count];

        int a=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=ch)
            {
                brr[a]=arr[i];
                a++;
            }
        }

        System.out.println("!!!!!!!!!!!!!!!!!");
        for(int i=0;i<brr.length;i++)
        {
            System.out.println(brr[i]);
        }
       
        System.out.println(arr.length);
        System.out.println(brr.length);
    }
}