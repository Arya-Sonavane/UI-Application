import java.util.*;
class Factorial
{
    int fact;
    int no;
void setValue(int x)
 {
      no=x;

 }
  int getFactorial()
  { 
    int fact=1;
     
    for(int i=1; i<=no; i++)
    {
     fact=fact*i;
     
     }
      System.out.printf("factorial of number is %d",fact);
      return fact;
    }
 
}

public class FactorialApp
{
  public static void main(String a[])
  {
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter a number");
     int x=xyz.nextInt();
     //int no=xyz.nextInt();
     Factorial f=new Factorial();
     f.setValue( x);
     f.getFactorial();
 
  }

}