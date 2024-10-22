import java.util.*;
public class DuckNumber
{
     public static void main(String x[])
    {
          int no,cnt=0;
          Scanner xyz=new Scanner(System.in);
          System.out.println("Enter a number");
          no=xyz.nextInt();


          while(no!=0)
          {
               int rem=no%10;
               if(rem==0){cnt++;}
               no=no/10;
          }

             
          String result= cnt>0? "it is a Duck number": "It is not a Duck number";
          System.out.println(result );
          }
  
}