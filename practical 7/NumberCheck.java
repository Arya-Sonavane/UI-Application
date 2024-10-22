import java.util.*;
public class NumberCheck
{
     public static void main(String x[])
     {
     int a=0,b;
     String result;
     Scanner xyz=new Scanner(System.in);
     System.out.println("Check even odd");
     System.out.println("Check no is positive, negative or zero");
     System.out.println("check maximum no");
     
     System.out.println("enter choice");
     int choice=xyz.nextInt();

     switch (choice)
     {
        case 1:
             System.out.println("enter number");
             a=xyz.nextInt();
              result= a%2==0? "Number is even":"number is odd";
             System.out.println(result);
         break;
        case 2:
             System.out.println("enter number");
             b=xyz.nextInt();
              result= a>0? "Number is positive":"number is negative";
             System.out.println(result);
         break;
        case 3:
             System.out.println("enter two values");
             a=xyz.nextInt();
             b=xyz.nextInt();
              result= a>b? "a is maximum no":"b is maximum number";
             System.out.println(result);
         break;
         default:
        
             System.out.println("wrong choice");
       }
   }
}
        
