import java.util.*;
public class FirstOccuranceOfWord
{
    public static void main(String arg[])
    {
        String str="learn c at tutorial gateway";

                     // tutorial
        char arr[]=str.toCharArray();

        String btr="tutorial";

        char brr[]=btr.toCharArray();

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
        if(flag==0)
        {
            System.out.println("Not Found!");
        }
        else
        {
            System.out.println("Yes"+i);
        }

    }
}


/*
                                                     //! Algorithm

                                                1)Covert String to Array
                                                2)Take user string and convert to array
                                                3)loop through outer array match user input with array
                                                (we perserve value of outer loop which gives later starting index of occurance)
                                                if(arr[i]==brr[0])
                                                {
                                                  flag(used for make conditions)
                                                  for(int j=0;j<brr.length;j++)
                                                  {
                                                    if(arr[i])
                                                  }
                                                }
 */