class Customer{

	int id;
	String name,contact;
	void setCustomer(int cid,String n,String c)
	{
		id=cid;
		name=n;
		contact=c;
	}
	int getId(){
		return id;
	}
	String getName(){
		return name;
	}
	String getContact(){
		return contact;
	}


}