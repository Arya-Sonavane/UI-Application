
public class LowestFrequency
{
    public static void main(String arg[])
    {
        
        String str="vaivbhavaa";

        char arr[]=str.toCharArray();
  
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
                if(count==1)
                {
                    System.out.println(arr[i]);
                }
            
            }
        }

       
    }
}