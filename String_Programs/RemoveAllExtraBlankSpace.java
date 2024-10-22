public class RemoveAllExtraBlankSpace
{
    public static void main(String arg[])
    {
        String str="vaibhav   Shete";

        char arr[]=str.toCharArray();
        char brr[]=new char[17];
        int a=0;
        for(int i=0;i<arr.length;i++)
        { 
             if(arr[i]!=' ')
             {
                brr[a]=arr[i];
                a++;
             }
             else
             {
                 if(arr[i]==' ' && arr[i+1]!=' ')
                 {
                    brr[i]=arr[i];
                    a++;
                 }
             }
        }
        for(int i=0;i<brr.length;i++)
        {
            System.out.println(brr[i]);
        }
    }
}