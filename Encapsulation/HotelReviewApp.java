import java.util.*;
public class HotelReviewApp
{
   private static Hotel[] hotels=new Hotel[5];
   private static Scanner scanner=new Scanner(System.in);
   
   public static void main(String x[])
   {
     int choice;
     do{
         System.out.println("\nHotel review system");
         System.out.println("\1 Add new hotel and add new customer in hotel");
         System.out.println("\2 view all hotels with their customer details");
         System.out.println("\3 search hotel by its name");
         System.out.println("\4 show hotel wise review");
         System.out.println("\5 Exit"); 
         System.out.println("Enter your choice");
         choice = scanner.nextInt();
         scanner.nextLine();

         switch (choice){
          case 1:
         {
           System.out.println("Enter hotel id");
            int hotelId = Scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter hotel name");
            String hotelName = scanner.nextLine();
            System.out.print("Enter hotel type");
            String hotelType = scanner.nextLine();

           Hotel hotel = new Hotel(HotelId,HotelName,HotelType, 5);
           
        for(int i=0; i<5; i++)
         {
            Sytem.out.print("Enter customer ID");
            int customerId = scanner.nextInt();
            Scanner.nextLine();
            System.out.print("Enter Customer Name");
            String customerName = scanner.nextLine();
            System.out.print("Enter customer review");
            String customerReview = scanner.nextLine();

          Customer customer = new Customer(customerId, customerName, customerReview, 5 );
          hotel.addCustomer(customer);
         }
           for(int i=0; i<hotels.length; i++)
           {
             if(hotels[i] == null)
             {
               hotels[i] = hotel;
               break;
             }
           }
       }
      break;
    case 2:
    {
      for(Hotel hotel : hotels)
      {
        if(hotel != null)
        {
          System.out.println("\nHotel Id:" + hotel.getId());
          System.out.println("\nHotel Name:" + hotel.getName());
          System.out.println("\nHotel Type:" + hotel.getType());
          System.out.println("customers");
          for(Customer customer : hotel.getCustomers())
          { 
            if(Customer != null )
            {
              System.out.println("\tCustomer Id:" + customer.getId());
              System.out.println("\tCustomer Name:" + customer.getName());
              System.out.println("\tCustomer Review:" + customer.getReview());
            }
          }
       }
     }

    }

     break;
   case 3:
   {
      System.out.print("Enter hotel name to search");
      String hotelName = scanner.nextLine();
      boolean found = false;

      for(Hotel hotel : hotels)
      if(hotel != null && hotel.getName().equalsIgnoreCase(hotelName))
      {
        System.out.println("\nHotel Id:" + hotel.getId());
        System.out.println("\nHotel Name:" + hotel.getName());
        System.out.println("\nHotel Type:" + hotel.getType());
        System.out.println("customers");
        for(Customer customer : hotel.getCustomers())
        {
          if(customer != null)
          {
            System.out.println("\tCustomer Id" + customer.getId());
            System.out.println("\tCustomer Name" + customer.getName());
            System.out.println("\tCustomer Review" + customer.getReview());
          }
        }
       found = true; 
      }
   }
    if(!found)
    {
       System.out.println("Hotel not found");
    }
      
  }
   break;
   case 4:
   {
      for(Hotel hotel : hotels)
      {
         if(hotel != null)
         {
           System.out.println("\nHotel Name" + hotel.getName());
           System.out.println("Reviews");
           for(Customer customer : hotel.getCustomers())
           {
             if(customer != null)
             {
               System.out.println("\tCustomer Name" + customer.getName());
               System.out.println("\tReview" + customer.getReview());
             }
           }
         }
      }
   }
       break;
     case 5:
        System.out.println("Exiting...");
        break;
      default:
        System.out.println("Invalid choice. please try again");
   }
    
} while (choice != 5);

