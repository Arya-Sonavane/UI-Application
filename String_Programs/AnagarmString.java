public class AnagarmString
{
    public static void main(String arg[])
    {
        String str="listen";
        String btr="sflent";

        char arr[]=str.toCharArray();
        char brr[]=btr.toCharArray();

       int count=0;
        if(arr.length==brr.length)
        {                
                for(int i=0;i<arr.length;i++)
                {
                    for(int j=0;j<brr.length;j++)
                    {
                        if(arr[i]==brr[j])
                        {
                            count++;
                            
                            break;
                        }
                    }
                }
                System.out.println(count);
                if(count==arr.length)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
        }
        else
        {
            System.out.println("Not!");
        }

       
    }
}