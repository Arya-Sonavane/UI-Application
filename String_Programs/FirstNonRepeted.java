public class FirstNonRepeted
{
    public static void main(String arg[])
    {
        String str="BeaButiful";
        char ch='\0';
        for(int i=0;i<str.length();i++)
        {
           int flag=1;
           ch=str.charAt(i);
           for(int j=i+1;j<str.length();j++)
           {
              if(ch==str.charAt(j))
              {
                 flag=0;
                 break;
              }
           }
           if(flag==1)   //s
           {
             break;
           }
        }
        System.out.println(ch);    
    }
}