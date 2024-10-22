public class RemoveFirstOccuranceOfWord
{
    public static void main(String arg[])
    {
        String str=" the vaxbhav Shete vaibhav is good boy vaibhav ";

        String btr="vaibhav";

        char arr[]=str.toCharArray();
        char brr[]=btr.toCharArray();
        char crr[]=new char[arr.length-brr.length];

        System.out.println(arr.length);
        System.out.println(brr.length);

        int i=0;
        int flag=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==brr[0])
            {
                flag=1;
                for(int j=0;j<brr.length;j++)
                {
                    if(arr[i+j]!=brr[j])
                    {
                        flag=0;
                        break;
                    }
                }
            }
            if(flag==1)
            {
                break;
            }
        }
       
        int a=i;
        int b=a+(brr.length);
        for(i=a;i<b;i++)
        {
            arr[i]='#';
        }

        int x=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!='#')
            {
              crr[x]=arr[i];
              x++;
            }
        }

        System.out.println("!!!!!!!!!!");
        for(i=0;i<crr.length;i++)
        {
            System.out.println(crr[i]);
        }
    }
}