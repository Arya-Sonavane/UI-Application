import java.util.*;
public class Salary
{
    public static void main(String x[])
    {
      int basicSalary, da, hra, Gs;
      Scanner xyz = new Scanner(System.in);
      System.out.println("Enter basicsalary");
      basicSalary=xyz.nextInt();

     if(basicSalary<=10000)
     {
          da=basicSalary*80/100;
          hra=basicSalary*20/100;
          Gs=basicSalary+da+hra;
          System.out.println("Gross Salary"+ Gs);
     }
     else if(basicSalary<=20000)
     {
          da=basicSalary*90/100;
          hra=basicSalary*25/100;
          Gs=basicSalary+da+hra;
          System.out.println("Gross salary"+ Gs);
     }
     else if(basicSalary>20000)
     {
          da=basicSalary*95/100;
          hra=basicSalary*30/100;
          Gs=basicSalary+da+hra;
          System.out.println("GRoss salary"+ Gs);
     }
     }
}
    
      
      