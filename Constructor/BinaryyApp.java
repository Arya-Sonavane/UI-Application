import java.util.*;
class Binaryy
{ int num;
  Binaryy(int num)
  {
     this.num=num;   
  }
 Binaryy(int a[])
 {
   int num=0;
   for(int i=0; i<a.length; i++)
   {
     int m=0;
    for(int j=0; j<=i; j++)
    {
      m=2*j;
      if(a[i]==1 && j==0)
      {

       m=1;
      }
    }
    num=num+(a[i]*m);
   }
  System.out.print("\n Decimal no is"+num);
 }

}
public class BinaryyApp
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter number");
    int no=xyz.nextInt();
    
    int a[]={1,0,1,0};
    Binaryy c=new Binaryy(a);
  }

}
