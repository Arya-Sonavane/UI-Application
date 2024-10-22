import java.util.*;
public class ArrayOfObj3
{
   public static void main(String x[])
   {
	
	Product3 p []=new Product3[2];
	int i,id,price,f=0;
	String name;
	Scanner sc =new Scanner(System.in);
	for(i=0; i<p.length; i++){
	p[i]=new Product3();
	
	System.out.println("Enter The Id Of Product:");
	id=sc.nextInt(); 
	System.out.println("Enter The Name Of Product:");
	name=sc.next();
	System.out.println("Enter The Price Of Product:");
	price=sc.nextInt();
	 p[i].setId(id);
	 p[i].setName(name);
	 p[i].setPrice(price);
	}

       System.out.println("Product List:");

       for(i=0; i<p.length; i++){

	System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
	}

      System.out.println("Enter Product Price For Search");
      price=sc.nextInt();
       if( price==p[i].getPrice())
         {
	  System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
          f=1;
         }
	}
       if(f==0){
          System.out.println("Product List Not Found:");
       }
    
   }

} 