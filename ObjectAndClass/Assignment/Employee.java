import java.util.*;
class Employee
{   String name;
    int id, basicSal;
    int totalsal;
   void setPersonalInfo(String name,int id,basic sal)
   {
      this.name=name;
      this.id=id;
      Sal=basicSal;
      totalsal=basicSal;

   }

  void setProgressPer(int progress)
  {
      if(progress>60)
      {
        totalsal=totalsal+(sal*30/100);

 }

}

class EmployeeP
{
void show()
{
   System.out.println("************************");
   System.out.println("Employee Details");
   System.out.println("name\n"+name);
   System.out.println("id\n"+id);
   System.out.println("basicsal\n"+Sal);
   System.out.println("Total salary after increment\n"+totalsal);
  }
}

public class Employee
{
  public static void main(String x[])
  {
       Scanner xyz=new Scanner(System.in);
       System.out.println("Enter the name");
       String name=xyz.nextLine();
       System.out.println("Enter the id");
       int id=xyz.nextInt();
       System.out.println("Enter salary");
       int sal=xyz.nextInt();
       System.out.println("Enter progress");
       int progress=xyz.nextInt();

       EmployeeP s=new EmployeeP();
       EmployeeP.setPersonalInfo(name,id,sal);
       EmployeeP.setProgressPer(progress);
       EmployeeP.show();
   }
}

}