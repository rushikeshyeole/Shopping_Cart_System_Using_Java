
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		product_cart_management pcm = new product_cart_management();
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Your Product is");
		product[] p = pcm.printProducts();
		System.out.println("---------------------------------------------");
		cart[] c = pcm.createCart(p);
		System.out.println("---------------------------------------------");
		pcm.displayCart(c);
		
		System.out.println("---------------------------------------------");
		
		boolean condition = true;
		
		while(condition)
		{
			System.out.println("Which operations do you want top perform : ");
			System.out.println("1) Add product \n2) Remove Product \n3) Total Bill");
			int aiI = n.nextInt();
			
			switch(aiI)
			{
			case 1:
	            c = pcm.addAnotherItem(p, c);
	            System.out.println("---------------------------------------------");
	            
	            System.out.println("Your Cart Item is");
	            System.out.println(" ");
	            System.out.println("pid" + " " + "pname" + " " + "price" + " " + "quantity");
	            pcm.displayCart(c);
	            System.out.println("---------------------------------------------");
	            condition = true;
	            break;
	            
	            
	            
			case 2:
			    c = pcm.removeProduct(c);
			    System.out.println("---------------------------------------------");
			    System.out.println("Your Cart Item is");
	            pcm.displayCart(c);
	            System.out.println("---------------------------------------------");
			    break;
	            
			case 3:
				
				condition = false;
				System.out.println("---------------------------------------------");
				int total_bill = pcm.totalBill1(c);
				System.out.println("Your Total Bill is : " + total_bill);
				break;
	            
			}
		}
		
		
		
	}
	

}
