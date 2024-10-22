
public class Highest
{
    public static void main(String arg[])
    {
        
        String str="vaivbhavaa";

        char arr[]=str.toCharArray();
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            if(arr[i]!='#')
            {
                for(int j=i+1;j<arr.length;j++)
                {
                
                        if(arr[i]==arr[j])
                        {
                        count++;
                        arr[j]='#';
                        }
                    
                }
                //System.out.println(count);

                if(result<count)
                {
                    result=count;
                }

            }
        }

        System.out.println(result);
    }
}