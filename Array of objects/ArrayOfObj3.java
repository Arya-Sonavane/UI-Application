import java.util.*;
public class ArrayOfObj3
{
   public static void main(String x[])
   {
	
	Product3 p []=new Product3[3];
	int i,id,price;
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

       System.out.println("before product with same price:");
       System.out.println("Id Name Price");
       for(i=0; i<p.length; i++){

	System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
	}

      System.out.println("Find Product with same Price");
       
       for(i=0; i<p.length; i++)
       {
          for(int j=i+1; j<p.length-1; j++)
          {
             if(p[i].getPrice()==p[j].getPrice())
             {
               p[i].setValue(1);
               p[j].setValue(1);
             }
          }
       }
      System.out.println("After 1 value inserted");
      for(i=0; i<p.length; i++ )
       {
         if(p[i].getValue()==1)
         {
           System.out.printf("%d\t%s\t%d\t%d\n", p[i].getId(),p[i].getName(),p[i].getPrice(),p[i].getValue() );
         }
       }
}
}
  
  