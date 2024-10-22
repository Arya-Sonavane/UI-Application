// public class CheckStringEndWith
// {
//     public static void main(String arg[])
//     {
//         String str="Vaibhav Shete";

//         String btr="ete";
        
//         //Inbuid Method  //! endWith()

//         boolean result=str.endsWith(btr);
//         System.out.println(result);
//     }
// }

public class CheckStringEndWith
{
    public static void main(String arg[])
    {
        String str="Vaibhav Shete";
        String btr="etd";

        char arr[]=str.toCharArray();
        char brr[]=str.toCharArray();


        int end=arr.length-3;
        
        for(int i=arr.length-1;i>=end;i--)
        {
            int flag=1;
            if(arr[i]==brr[0])
            {
                
                for(int j=0;j<btr.length();j++)
                {
                    if(arr[i+1]!=brr[j])
                    {
                       flag=0;
                       break;
                    }
                }
                if(flag==1)
                {
                    System.out.println("Yes!");
                    break;
                }

            }
            if(flag==1)
            {
                System.out.println("Yes!");
                break;
            }
        }

    }
}