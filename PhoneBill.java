import java.util.Scanner;
public class phoneBill
{

       public static void main(String x[])
       {
             double calls, totalBill=200;
             Scanner xyz=new Scanner(System.in);

             System.out.println("Enter number of calls for a month");
             calls= xyz.nextDouble();

             if(calls>100 && calls<150)
             {
             totalBill= totalBill+((calls-100)*0.60);
             System.out.println("Number of calls are:"+calls);
             System.out.println("Total phone bill"+totalBill);
             }
             else if(calls>150 && calls<200)
             {
             totalBill= totalBill+((calls-100)*0.60)+((calls-150)*0.50);
             System.out.println("Number of calls are" +calls);
             System.out.println("Total phone bill" +totalBill);
             }
             else if(calls>200 && calls<250)
             {
             totalBill= totalBill+((calls-100)*0.60)+((calls-150)*0.60)+((calls-200)*0.40);
             System.out.println("Number of calls are" +calls);
             System.out.println("Total phone bill" +totalBill);
             }
             else if(calls>250)
             {
             totalBill= totalBill+((calls-100)*0.60)+((calls-150)*0.60)+((calls-200)*0.40)+((calls-250)*0.35);
             System.out.println("Number of calls are" +calls);
             System.out.println("Total phone bill" +totalBill);
             }
        }
}
             
