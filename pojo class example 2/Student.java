class Student
{
   private int Id;
   private String Name;
   private String Email;
   private String Address;
   private Long Contact;   

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
   public void setEmail(String e)
   {
     Email=e;
   }
   public String getEmail()
   {
     return Email;
   }
    public void setAddress(String add)
   {
     Address=add;
   }
   public String getAddress()
   {
     return Address;
   }
   public void setContact(Long c)
   {
     Contact=c;
   }
   public Long getContact()
   {
     return Contact;
   }
}