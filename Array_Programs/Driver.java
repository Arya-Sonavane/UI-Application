
class Vehicle
{
     private int model;
     private int registration;
     private int Fual_Capacity;
     private int Fuel_Consumption;

    Vehicle(int a,int b,int c,int d)
    {
        model=a;
        registration=b;
        Fual_Capacity=c;
        Fuel_Consumption=d;
    }

    public int getModel()
    {
        return model;
    }
    public int getRegistration()
    {
        return registration;
    }
    public int getFual_Capacity()
    {
        return Fual_Capacity;
    }
    public int getFuel_Consumption()
    {
        return Fuel_Consumption;
    }

     
    
} 
class Truck extends Vehicle
{
    Truck()
    {
        super(1,100,200,300);
    }
    void show()
    {
      System.out.println(getModel());
    }
}
public class Driver
{
    public static void main(String arg[])
    {
        Truck obj=new Truck();
        obj.show();
    }
}