import java.util.*;

class FindDecimal
{
  int crr[];
  FindDecimal(int brr[])
  {
     crr=brr;
  }

  void FindDecimal()
  {
   int sum=0;
   //int length=m.length;
   for(int i=0;i<crr.length;i++)
   {
      sum=sum*2+crr[i];
   }

   System.out.println(sum);
  }
}
public class Decimal
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter the size of binary number:");
    int iSize=sobj.nextInt();
     
    int arr[]=new int[iSize];

    System.out.println("Enter the elements in array");
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sobj.nextInt();
    }

    FindDecimal obj=new FindDecimal(arr);
    obj.FindDecimal();

  }
}
