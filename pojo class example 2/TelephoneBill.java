class TelephoneBill
{
  Customer cu[];
  int size;
  float bill,tb;
    void setCustomer(Customer cu[], int size)
    {
       this.cu=cu;
       this.size=size;
    }

     public void calculateBill()
    {
        for(int i=0; i<size;i++)
        {
          System.out.println("**********************");
          int c=cu[i].getMonthlyCall();
          if(c>0 && c<=100)
          {
             bill=200;
          }
         else if(c>100 && c<=150)
         {
            bill=200+(c-100)*0.6f;
         }
         else if(c>150 && c<=200)
         {
            bill=230+(c-150)*0.5f;
         }
        else
         {
           bill=255+(c-200)*0.4f;
         }
     
       System.out.println("......................"+bill);
       cu[i].setBill(bill);

        
    }

}


    void show()
    {
       System.out.println("===========hello============"+size);
       System.out.println("Id="+cu[0].getId());
       System.out.println("Name="+cu[0].getName());
       System.out.println("Address="+cu[0].getAddress());
       System.out.println("Email="+cu[0].getEmail());
       System.out.println("Contact="+cu[0].getContact());
       System.out.println("MonthlyCall="+cu[0].getMonthlyCall());
       System.out.println("Bill="+cu[0].getBill());


       for(int i=0; i<size; i++)
       {
         System.out.println("Id="+cu[i].getId());
         System.out.println("Name="+cu[i].getName());
         System.out.println("Address="+cu[i].getAddress());
         System.out.println("Email="+cu[i].getEmail());
         System.out.println("Contact="+cu[i].getContact());
         System.out.println("MonthlyCall="+cu[i].getMonthlyCall());
         System.out.println("Bill="+cu[i].getBill());
       }

    }
}

















