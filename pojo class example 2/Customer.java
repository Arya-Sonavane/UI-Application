public class Customer
{
     private int Id;
     private String Name;
     private String Address;
     private String Email;
     private Long Contact;
     private int MonthlyCall;
     private float Bill;
    
     
     public void setId(int i)
     {
        Id=i;
     }
     public int getId()
     {
       return Id;
     }
      public void setName(String n)
     {
        Name=n;
     }
     public String getName()
     {
       return Name;
     }
      public void setAddress(String add)
     {
        Address=add;
     }
     public String getAddress()
     {
       return Address;
     }
     public void setEmail(String e)
     {
        Email=e;
     }
     public String getEmail()
     {
       return Email;
     }
      public void setContact(Long c)
     {
        Contact=c;
     }
     public Long getContact()
     {
       return Contact;
     }
      public void setMonthlyCall(int m)
     {
        MonthlyCall=m;
     }
     public int getMonthlyCall()
     {
       return MonthlyCall;
     }
     public void setBill(float m)
     {
        Bill=m;
     }
     public float getBill()
     {
       return Bill;
     }
}

