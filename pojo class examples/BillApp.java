class Bill{
	
	Customer cc;
	Product pp[];
	void setOrders(Customer c,Product ...p)
	{
		cc=c;
		pp=p;
	}	

	void generateInvoice(){
		int total=0;
		int grandTotal=0;
		System.out.println(cc.getId()+"\t"+cc.getName()+"\t"+cc.getContact());
		System.out.println("==================================================");
		System.out.println("Product_Id\tProduct_Name\tQuantity\tPrice\tTotal");
		System.out.println("=============================================================");
		for(int i=0;i<pp.length;i++)
		{
			total = pp[i].getQty()*pp[i].getRate();//6*50=300
		System.out.printf("%d\t%s\t\t\t%d\t\t%d\t%d\n",pp[i].getId(),pp[i].getName(),pp[i].getQty(),pp[i].getRate(),total);
			grandTotal=grandTotal+total;
		}
		System.out.println("============================================================");
		System.out.println("\t\t\t\t="+grandTotal);//335
		
	
	}
}

public class BillApp{

	public static void main(String a[])
	{	
		Product product[] = new Product[2];// memeory block i.e 2
		product[0]=new Product();// object create at 0th index.
		product[0].setId(1);
		product[0].setName("Parle-G");
		product[0].setQty(5);
		product[0].setRate(10);

		product[1]=new Product();// object create at 0th index.
		product[1].setId(2);
		product[1].setName("Cadbury");
		product[1].setQty(10);
		product[1].setRate(10);


		Customer cust = new Customer();
		cust.setCustomer(1,"ABC","9999999999");
		
		Bill bill = new Bill();
		bill.setOrders(cust,product);
		bill.generateInvoice();

		
	}

}