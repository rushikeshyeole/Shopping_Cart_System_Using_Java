
import java.util.Scanner;

public class product_cart_management {
	
	Scanner n = new Scanner(System.in);
	
	public product[] printProducts()
	{
		product[] p = new product[3];
		
		p[0] = new product(101 , "Watch" , 500);
		p[0].displayProduct();
		
		p[1] = new product(102 , "Spect" , 300);
		p[1].displayProduct();
		
		p[2] = new product(103 , "Shirt" , 700);
		p[2].displayProduct();
		
		
		return p;
	}
	
	public cart[] createCart(product[] p)
	{
		cart[] c = new cart[3];
		
		System.out.println("Which Product do you want to add in your cart : ");
		int cpI = n.nextInt();
		
		for(int i = 0; i < p.length; i++)
		{
			if(p[i] != null)
			{
				if(p[i].pid == cpI)
				{
					c[i] = new cart(p[i].pid, p[i].pname, p[i].price, 0);
					c[i].quantity = c[i].quantity + 1;
				}
			}
		}
		
		return c;
	}
	
	public void displayCart(cart[] c)
	{
		System.out.println("Your Cart is");
		for(int i = 0; i < c.length; i++)
		{
			if( c[i] != null)
			{
				
				c[i].displayCartProduct();
			}
			
		}
	}
	
	public cart[] addAnotherItem(product[] p, cart[] c)
	{
		System.out.println("Which Product do you want to add in your cart : ");
		
		int aaI = n.nextInt();
		
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] != null)
			{
				if(aaI == c[i].pid)
				{
					System.out.println("This Item is already in your cart.");
					System.err.println("Do you want to add extra quantity ?");
					System.out.println("1) Yes \n2) No");
					int qI = n.nextInt();
					
					switch(qI)
					{
					case 1: 
						System.out.println("How much do you want to extra add ?");
						int quan = n.nextInt();
						c[i].quantity = c[i].quantity + quan;
						
					case 2:
						System.out.println("Ok...");
					}
				}
				else
				{
					addItem(p, c, aaI);
				}
			}
		}
		
		return c;
	}
	
	public void addItem(product[] p, cart[] c, int aaI)
	{
		for(int i = 0; i < p.length; i++)
		{
              if(p[i].pid == aaI)
				{
				   c[i] = new cart(p[i].pid, p[i].pname, p[i].price, 0);
				   c[i].quantity = c[i].quantity + 1;
				}				
	    }
	}

	public int totalBill1(cart[] c) 
	{
		int total_bill = 0;
		
		for(int i=0; i < c.length; i++)
		{
			if(c[i] != null)
			{
				total_bill = total_bill + (c[i].price * c[i].quantity);
			}
		}
		
		return total_bill;
	}

	public cart[] removeProduct(cart[] c) {
		
		System.out.println("Which product do you want to remove : ");
		int rpI = n.nextInt();
		
		for(int i=0; i < c.length; i++)
		{
			if(c[i] != null)
			{
				if(c[i].pid == rpI)
				{
					c[i] = null;
				}
			}
		}
		
		return c;
	}
}
