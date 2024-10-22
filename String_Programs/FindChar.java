public class FindChar
{
    public static void main(String arg[])
    {
        String str="Vaibhav08&";

        char arr[]=str.toCharArray();


        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>='a' && arr[i]<='z' || arr[i]>='A' && arr[i]<='Z')
           {
              count++;
           }
           else if(arr[i]>='0' && arr[i]<='9')
           {
              count1++;
           }
           else 
           {
             count2++;
           }

           
           
        }
        ///////////////

        System.out.println("!!!!!!!!!!!!");

        System.out.println("The Number of alphabes:"+count);
        System.out.println("The Numbers are:"+count1);
        System.out.println("The special characters are:"+count2);
}
}