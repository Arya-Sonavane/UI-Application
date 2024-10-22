public class GetLastThree
{
    public static void main(String arg[])
    {
        String str="vaibhav shete";
        char arr[]=str.toCharArray();
        
        int i=0;
        for(i=0;i<arr.length;i++)
        {
        
            if(arr[i]==' ')
            {
                int End=i;
                int Start=End-3;

                for(int j=Start;j<End;j++)
                {
                    System.out.println(arr[j]);
                }
            }
            
        }

    }
}