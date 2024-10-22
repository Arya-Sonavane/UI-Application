import java.util.*;
public class electricity
{
     public static void main(String x[])
     {
         Scanner xyz=new Scanner(System.in);
         System.out.println("enter consumed units ");
          int units = xyz.nextInt();
         double bill=0;

         if(units<=50)
          {
            bill = units*0.50;
          }
          else if(units <=150)
          {
            bill= 25+(units-50)*0.75;
          }
          else if(units<=250)
          {
            bill= 100+(units-150)*1.20;
          }
          else 
          {
            bill=220+(units - 250)*1.50;
           }

             double subcharge= bill*0.20;
             double totalBill= bill+subcharge;

            System.out.println("Electricity bill is"+ bill);
            System.out.println("Subcharge is "+subcharge);
            System.out.println("Total bill(add subcharge):Rs" +totalBill);
         }
}
         

         

         



         
 