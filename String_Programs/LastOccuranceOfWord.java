import java.util.*;
public class LastOccuranceOfWord
{
    public static void main(String arg[])
    {
        String str="learn c at tutorial gateway tutorial";

                     // tutorial
        char arr[]=str.toCharArray();

        String btr="tutorial";

        char brr[]=btr.toCharArray();

        int i=0;
        int flag=0;

        for(i=arr.length-1;i>=0;i--)
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
        
        System.out.println(i);

    }
}

