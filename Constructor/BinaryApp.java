import java.util.*;
class Binary
{ int num;
  Binary(int num)
  {
    this.num=num;
  }
 void show()
 {
  int i=0;
     int binary[]=new int[100];
    while(num!=0)
    {
      binary[i]=num%2;
      num=num/2;
      i++;
    }
   System.out.print("binary value is:");
   for(int j=i-1; j>=0; j--)
   {
     System.out.print(""+binary[j]);
   }
    

 }
}

public class BinaryApp
{
  public static void main(String x[])
  {
       Scanner xyz=new Scanner(System.in);

      
       System.out.println("Enter number");
       int no=xyz.nextInt();

       Binary b=new Binary(no);
       b.show();
    
    
  }

}
