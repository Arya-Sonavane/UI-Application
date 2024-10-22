import java.util.*;
class ExtractDigitAndCalsum
{
   char m[];

   void setCharArray(char a[])
   {
     m=a;
   }

   int getSum()
   {
     int sum=0;
   
     for(int i=0; i<m.length; i++)
     {
       if(m[i]>='0' && m[i]<='9')
       {
         sum=sum+( m[i]-'0'); 
       } 
     } 
       return sum;
   }
    
}

public class DigitsApp
{
  public static void main(String x[])
  {

    Scanner xyz=new Scanner(System.in);
    

     char a[]=new char[7];

     for(int i=0; i<a.length; i++)
    {
          a[i]=xyz.next().charAt(0);
     }
    for(int i=0; i<a.length; i++)
    {
         System.out.println("Sum of digits in array is" +a[i]);
     }

    ExtractDigitAndCalsum  ss=new ExtractDigitAndCalsum();
    ss.setCharArray(a);
    
    int result=ss.getSum();
    System.out.println("Sum of digits in array is"+result);
  }
}