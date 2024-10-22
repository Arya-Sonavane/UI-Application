public class CountVowel
{
    public static void main(String arg[])
    {
        String s1="abcdefghijklmnopqrstuvwxyz";
        
        char arr[]=s1.toCharArray();
        int count=0;
        int count1=0;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]=='a' || arr[i]=='e' || arr[i]=='o' || arr[i]=='i' || arr[i]=='u')
          {
            count++;
          }
          else
          {
            count1++;
          }
        }
        System.out.println(count);
        System.out.println(count1);

    }
}