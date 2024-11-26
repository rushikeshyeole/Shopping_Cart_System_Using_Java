


public class cart {

	int pid;
	String pname;
	int price;
	int quantity = 0;
	
	public cart(int pid, String pname, int price, int quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}

	void displayCartProduct()
	{
		System.out.println(pid + " " + pname + " " + price + " " + quantity);
	}
	
}
