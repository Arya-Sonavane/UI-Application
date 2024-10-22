package SetterGetter;

class Customer {
    private int id;
    private String name;
    private String email;
    private long contact;
    private int monthlyCalls;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public int getMonthlyCalls() {
        return monthlyCalls;
    }

    public void setMonthlyCalls(int monthlyCalls) {
        this.monthlyCalls = monthlyCalls;
    }

   
}
public class TelephoneBillApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customer[] customers = new Customer[5];

        // Initialize each Customer object separately
        customers[0] = new Customer();
        customers[0].setId(111);
        customers[0].setName("Arya");
        customers[0].setEmail("aryasonavane33211@gmail.com");
        customers[0].setContact(90750895);
        customers[0].setMonthlyCalls(22);

        customers[1] = new Customer();
        customers[1].setId(112);
        customers[1].setName("Divya");
        customers[1].setEmail("aryasonavane3211@gmail.com");
        customers[1].setContact(90750895);
        customers[1].setMonthlyCalls(16);

        customers[2] = new Customer();
        customers[2].setId(113);
        customers[2].setName("Aarohi");
        customers[2].setEmail("aryasonavane211@gmail.com");
        customers[2].setContact(90750895);
        customers[2].setMonthlyCalls(15);

        customers[3] = new Customer();
        customers[3].setId(114);
        customers[3].setName("Kavya");
        customers[3].setEmail("aryasonavane11@gmail.com");
        customers[3].setContact(90750895);
        customers[3].setMonthlyCalls(10);

        customers[4] = new Customer();
        customers[4].setId(115);
        customers[4].setName("Samiksha");
        customers[4].setEmail("aryasonavane1@gmail.com");
        customers[4].setContact(90750895);
        customers[4].setMonthlyCalls(20);
    }
}	
