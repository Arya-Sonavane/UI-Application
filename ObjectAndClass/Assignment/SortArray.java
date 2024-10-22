import java.util.*;
class SortCharArray
{
  char a[];
 
  void setCharArray(char a1[])
  {
    a=a1;  
  }  
  char [] getSortArray()
    {
     for(int i=0;i<a.length;i++)
       {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    char temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
       }

       return a;
   }
}


public class SortArray
{
   public static void main(String x[])
   {
       Scanner xyz=new Scanner(System.in);

         System.out.println("Enter size of array");
          int iSize=xyz.nextInt();
          
           char arr[]=new char[iSize];

      System.out.println("Enter elements in array");
        for(int i=0; i<arr.length; i++)
        {  
          arr[i]=xyz.next().charAt(0);
        }
 
      
     
     SortCharArray sca=new SortCharArray();

     sca.setCharArray(arr);

     char brr[]=sca.getSortArray();

   System.out.println("Sorted Array");
    for(int i=0; i<brr.length;i++)
    {
       System.out.println(brr[i]);
    }
  }
}