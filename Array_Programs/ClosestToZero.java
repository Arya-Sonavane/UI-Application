import java.lang.Math;
public class ClosestToZero
{
    public static void main(String arg[])
    {
       int arr[]=new int[]{38,44,63,-51,-35,19,84,-69,4,-46};
       int i=0;
      
       int n=arr[0];
       int m=arr[1];

       int p=n+m;

       int sum=0;
       
       for(i=0;i<arr.length;i++)
       {
          for(int j=i+1;j<arr.length;j++)
          {
             sum=arr[i]+arr[j];

             if(Math.abs(sum)<Math.abs(p)) // Math.abs is used for negative value convert into positve
             {
                p=sum;
                n=arr[i];
                m=arr[j];
             }
          }
       }
       System.out.println(p);
       System.out.println(n+""+m);
    }
}