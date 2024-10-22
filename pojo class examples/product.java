Product.java
public class Product
{
   private int id;
   private String name;
   private int qty;
   private int rate;
   
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
    public void setQty(int q)
   {
     qty=q;
   }  
   public int getQty()
   {
     return qty;
   } 
   public void setRate(int r)
   {
       rate=r;
   }
  public int getRate()
  {
    return rate;
  }

}