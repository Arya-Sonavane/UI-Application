import java.util.*;
public class Delete
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int arr[]=new int[]{10,20,30,40,50};
        System.out.println("Enter Index:");
        int index=sobj.nextInt(); //1

        int brr[]=new int[arr.length-1];
        int a=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i!=index)
            {
                brr[a]=arr[i];
                a++;
            }
        }

        for(int j=0;j<brr.length;j++)
        {
            System.out.println(brr[j]);
        }

        
    }
}

// 10 20 30 40 50   arr
// 1
//10 30 40 50       //brr