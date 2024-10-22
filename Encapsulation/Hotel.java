class Hotel
{
  private int id;
  private String name;
  private String type;
  private Customer[] customers;
  
  

  public void setId(int id)
  {
    this.id=id;
  }
  public int getId()
  {
    return id;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public String getName()
  {
    return name;
  }
  public void setType(String type)
  {
    this.type=type;
  }
  public String getType()
  {
    return type;
  }
  
  public Customer[] getCustomers()
 {
   return customers;
 }
 
 public void addCustomer(Customer customer)
 {
   for(int i=0; i<customer.length; i++ )
   {
      if(customers[i]==null)
      {
         customers[i] = customer;
         break;
      }
   }
 }
}

 
