


public class product {

	int pid;
	String pname;
	int price;
	
	public product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		
	}
	
	void displayProduct()
	{
		
		System.out.println(pid + " " + pname + " " + price);
	}
	
}
