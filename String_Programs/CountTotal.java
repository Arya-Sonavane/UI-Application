




//I am vaibhav Shete  ->space:3
// I am Vaibhav Shete ->space:5

public class CountTotal
{
    public static void main(String arg[])
    {
        String str="  Vaibhav shete Shete  ";
        int count=1;

        char arr[]=str.toCharArray();

        
        int count1=0;
        for(int j=arr.length-1;j>=0;j--)
        {
            if(arr[j]==' ')
            {
                count1++;
                
            }else{
                break;
            }
        }
        System.out.println(count1);

        boolean b=true;
        for(int i=0;i<str.length()-count1;i++)
        {
           if(str.charAt(i)==' ' && b)
           {
            
              continue;
              
           }
           else
           {
            b=false;
              if(str.charAt(i)==' ')
              {
                 count++;
              }
           }
        }
        System.out.println(count);     
    }
}