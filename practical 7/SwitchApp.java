import java.util.*;
public class SwitchApp
{
     public static void main(String x[])
     {
     int a,b;
     Scanner xyz=new Scanner(System.in);
     System.out.println("enter value a and b");
     a=xyz.nextInt();
     b=xyz.nextInt();
     System.out.println("enter choice");
     int choice=xyz.nextInt();

     switch (choice)
     {
       case 1:
       System.out.printf("Addition is %d\n", a+b);
       break;
       case 2:
       System.out.printf("Substraction is %d\n", a-b);
       break;
       case 3:
       System.out.printf("Multiplication is %d\n", a*b);
       break;
       case 4:
       System.out.printf("Division is %d\n", a/b);
       break;
       default:
       System.out.println("wrong choice");
     }
      }
}
     