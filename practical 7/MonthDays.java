import java.util.*;
public class MonthDays
{
     public static void main(String x[])
     {
     String result;
     Scanner xyz=new Scanner(System.in);
     System.out.println("enter month");
     int choice = xyz.nextInt();

     switch (choice)
     {
         case 1:
               System.out.println("january month is 31 days ");
         break;
         case 2:
               System.out.println("February month is 28 days");
         break;
         case 3:
               System.out.println("march month is 31 days");
         break;
         case 4:
               System.out.println("april month is 30 days");
         break;
         case 5:
               System.out.println("may month is 31 days");
         break;
         case 6:
               System.out.println("june month is 30 days");
         break;
         case 7:
               System.out.println("july month is 31 days ");
         break;
         case 8:
               System.out.println("August month is 31 days ");
         break;
         case 9:
               System.out.println("september month is 30 days ");
         break;
         case 10:
               System.out.println("october month is 31 days ");
         break;
         case 11:
               System.out.println("november month is 30 days ");
         break;
         case 12:
               System.out.println("december month is 31 days ");
         break;
      
         default:
               System.out.println("wrong choice");
          }
      }
}