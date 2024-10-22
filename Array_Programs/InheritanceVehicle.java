class Vehicle
{
   private String vehicleModel;
   private String RegistrationNumber;
   private String VehicleSpeed;
   private String FuelCapacity;
   private String FuelConsumption;

   Vehicle(String a,String b,String c,String d,String e)
   {
     vehicleModel=a;
     RegistrationNumber=b;
     VehicleSpeed=c;
     FuelCapacity=d;
     FuelConsumption=e;
   }

   public String getVehicleModel()
   {
        return vehicleModel;
   }
   public String getRegistrationNumber()
   {
     return RegistrationNumber;
   }
   public String getVehicleSpeed()
   {
     return VehicleSpeed;
   }
   public String FuelCapacity()
   {
    return FuelCapacity;
   }
   public String FuelConsumption()
   {
    return FuelConsumption;
   }

   void fuelNeeded(int kiloMeters)
   {
     
   }

   void DistanceCovered()
   {
      
   }
}
class Bus 
{
   private Vehicle vehicle;
   Bus(Vehicle vehicle)
    { 
         this.vehicle=Vehicle;
    }
     
}
class Truck extends Vehicle
{

}
public class InheritanceVehicle
{
    public static void main(String arg[])
    {
         
         Bus A =new Bus();

    }
}