public class RemoveAllOccuranceOfWord
{
    public static void main(String arg[])
    {
        String str=" the vaxbhav Shete vaibhav is good boy vaibhav ";

        String btr="vaibhav";

        char arr[]=str.toCharArray();
        char brr[]=btr.toCharArray();
       
        char crr[]=new char[46];
 
        int i=0;
        int flag=1;
        int sum=0;
        int count=0;
        int g=0;

       
     
        System.out.println(crr.length);


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

                if(flag==1)
                {
                    System.out.println(i);
                    for(int j=i;j<i+brr.length;j++)
                    {
                        arr[j]='#';
                        count++;
                    }

                    System.out.println("!!!!!!!!!!!!!!!!!!!!!");

                    for(int p=0;p<arr.length;p++)
                    {
                        System.out.println(arr[p]);
                    }

                    for(int y=0;y<arr.length-1;y++)
                    {
                        if(arr[y]!='#')
                        {
                        crr[g]=arr[y];
                        g++;
                        }
                    }
                

                    
                }

            }  
            
        }
        

    }
}