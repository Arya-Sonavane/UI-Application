import java.util.*;
public class Week
{
     public static void main(String x[])
     {
     String result;
     Scanner xyz=new Scanner(System.in);
     System.out.println("enter day");
     int choice = xyz.nextInt();

     switch (choice)
     {
         case 1:
               System.out.println("it is a mon");
         break;
         case 2:
               System.out.println("it is a tues");
         break;
         case 3:
               System.out.println("it is a wed");
         break;
         case 4:
               System.out.println("it is a thurs");
         break;
         case 5:
               System.out.println("it is a fri");
         break;
         case 6:
               System.out.println("it is a sat");
         break;
         case 7:
               System.out.println("it is a sun");
         break;
         default:
               System.out.println("wrong choice");
          }
      }
}