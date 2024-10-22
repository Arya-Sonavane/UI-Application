import java.util.*;
public class TelephoneBillAppp
{
    public static void main(String x[])
    {
        Scanner xyz=new Scanner(System.in);
        System.out.println("Enter how many customer you want to add:"-);
        int size=xyz.nextInt();
        Customer r[]=new Customer[size];

        for(int i=0; i<size; i++)
        {
            r[i]=new Customer();
            
            System.out.println("Enter customer ID");
            int id=xyz.nextInt();

            System.out.println("Enter customer Name");
            xyz.nextLine();

            System.out.println("Enter customer Email");
            String e=xyz.nextInt();

            System.out.println("Enter customer Address");
            String add=xyz.nextInt();

            System.out.println("Enter customer Contact");
            Long c=xyz.nextInt();

            System.out.println("Enter customer MonthlyCall");
            int m=xyz.nextInt();


             r[i].setId(id);
             r[i].setName(n);
             r[i].setAddress(add);
             r[i].setEmail(e);
             r[i].setContact(c);
             r[i].setMonthlyCall(m);
        }

            TelephoneBill tb=new TelephoneBill();
            tb.setCustomer(r,size);
            tb.calculateBill();
            tb.show();  
        



}