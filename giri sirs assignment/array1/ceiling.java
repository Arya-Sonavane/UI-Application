import java.util.*;

public class ceiling
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];

        System.out.println("Enter the Elements in array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        System.out.println("Display Elements");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Enter the ceiling");
        int pos=sobj.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(pos==arr[i])
            {
                System.out.println("ceiling:"+arr[i]);
                System.out.println("Floor:"+arr[i]);
            }
            else if(pos>arr[i] && pos<arr[i+1]) 
            {
                System.out.println("ceiling:"+arr[i+1]);
            }
        }

    }
}