import java.util.*;
public class ArrayOfObj1
{
   public static void main(String x[])
   {
    Product p[]= new Product[5];
    Scanner xyz=null;
    int i ,j,size,id,id1;
    size=p.length;
    for( i=0; i<size; i++)
    {
        p[i]=new Product();
        xyz=new Scanner(System.in);
        System.out.println("Enter product id, name, price");
        
        id=xyz.nextInt();
	xyz.nextLine();
	String name=xyz.nextLine();
        int price=xyz.nextInt();
         
        p[i].setName(name);
        p[i].setId(id);
        p[i].setPrice(price);
        
    } 


 for( i=0; i<size; i++)
    {
	
     System.out.println(p[i].getId()+" "+p[i].getName()+" "+p[i].getPrice());
    } 


System.out.println("Enter product id to delete record");
id1=xyz.nextInt();
for( i=0; i<size; i++)
    {
	if(id1==p[i].getId())
        {
		for(j=i;j<size-1;j++)
		{
			p[j]=p[j+1];
		}
		size--;
		break;
        }
     
    } 
	System.out.println("print after delete:");


for( i=0; i<size; i++)
    {
	
     System.out.println(p[i].getId()+" "+p[i].getName()+" "+p[i].getPrice());
    } 






    }
}