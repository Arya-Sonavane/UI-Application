import java.util.*;

public class InsertElementAtIndex
{ 
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size=sobj.nextInt();

        int arr[]=new int[size];

        int i=0;
        System.out.println("Enter the elements in array");
        for(i=0;i<arr.length-1;i++)
        {
            arr[i]=sobj.nextInt();
        }

        System.out.println("Array elements are:");
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Enter Index");
        int index=sobj.nextInt();

        System.out.println("Enter value");
        int value=sobj.nextInt();

        for(i=arr.length-1;i>index;i--) // 10 20 30 40 50 
        {
             arr[i]=arr[i-1];
        }
        arr[index]=value;
        System.out.println("!!!!!!!!!!!!!!!!!!");
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


    }
}
    
