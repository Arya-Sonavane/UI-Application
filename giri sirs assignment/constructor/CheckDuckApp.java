import java.util.*;
class CheckDuck
{
  int no;
  CheckDuck(int no)
  {
    this.no=no;
  }
 Boolean isDuckNumber()
 {
   Boolean b=false;
   for(int i=no;i>0;i=i/10)
   {
     int rem=no%10;
     if(rem==0)
    {
      b=true;
      break;
    }
   }
    return b;
 }
}

public class CheckDuckApp
{
  public static void main(String x[])
  {
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter number");
     int no=xyz.nextInt();

     CheckDuck c= new CheckDuck(no);

     Boolean z=c.isDuckNumber();
     if(z)
     {
       System.out.println("It is duck number");
     }
     else
     {
       System.out.println("It is not duck number");
     }
  }

}
