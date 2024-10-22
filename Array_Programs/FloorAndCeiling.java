public class FloorAndCeiling
{
    public static void main(String arg[])
    {
        int arr[]=new int[]{1,3,5,7,8,9};
        int i=0;
    
        for(int no=0;no<=10;no++)
        {
            for(i=0;i<arr.length;i++)
            {
                if(no<arr[0])
                {
                    System.out.println(" 0 ceiling is"+-1);
                    System.out.println(" 0 Floor is"+arr[0]);
                    break;
                }
                else if(no>arr[arr.length-1])
                {
                    System.out.println(" 10 ceiling is"+-1);
                    System.out.println(" 10 floor is"+arr[arr.length-1]);
                    break;
                }
                else if(no==arr[i])
                {
                    System.out.printf(" %d ceiling is %d\n",no,no);
                    System.out.printf(" %d floor is %d\n",no,no);
                    break;
                }
                else if(no>arr[i] && no<arr[i+1])
                {
                    System.out.printf(" %d ceiling is %d\n",no,no-1);
                    System.out.printf(" %d floor is %d\n",no,no+1);
                    break;
                }
            }
        }
    }
}