import java.util.*;
public class ArrayOfObj
{
   public static void main(String x[])
   {
    Product p[]= new Product[5];
    Scanner xyz=null;
int i,j;
    for( i=0; i<p.length; i++)
    {
        p[i]=new Product();
        xyz=new Scanner(System.in);
        System.out.println("Enter product id, name, price");
        
        int id=xyz.nextInt();
	xyz.nextLine();
	String name=xyz.nextLine();
        int price=xyz.nextInt();
         
        p[i].setName(name);
        p[i].setId(id);
        p[i].setPrice(price);
        
    } 
    System.out.println("Display All Products");
    for( i=0; i<p.length; i++)
    {
      System.out.printf("%s\t%d\t%d\n",p[i].getName(),p[i].getId(),p[i].getPrice());
    }

    for(i=0; i<p.length; i++)
    {
      	for(j=i+1; j<p.length; j++)
        {
		if(p[i].getPrice()<p[j].getPrice())
		{
			 Product temp=p[i];
			 p[i]=p[j];
			 p[j]=temp;	
		}
	}
    }	


	 System.out.println("Display All Products after sorting");
    for( i=0; i<p.length; i++)
    {
      System.out.printf("%s\t%d\t%d\n",p[i].getName(),p[i].getId(),p[i].getPrice());
    }
    

   }

}