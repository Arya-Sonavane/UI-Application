import java.util.*;

class Employee
{
    private int id;
    private String name;
    private int salary;

    public void setId(int i)
    {
        id=i;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setSalary(int s)
    {
        salary=s;
    }
    public int getSalary()
    {
        return salary;
    }
}
class Company
{
    Employee emp;
    
    void addNewEmployee(Employee e)
    {
        emp=e;
    }
    void showEmployee()
    {
        System.out.println("Name is"+emp.getName());
        System.out.println("Is is"+emp.getId());
        System.out.println("Salary is"+emp.getSalary());
    }
}
public class EmployeePOJO
{
    public static void main(String arg[])
    {
        Employee ee=new Employee();
        ee.setId(1);
        ee.setName("Arya");
        ee.setSalary(10000);

        Company dobj=new Company();
        dobj.addNewEmployee(ee);
        dobj.showEmployee();

    }
}