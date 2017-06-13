package test.com.seeni.model;

import com.seeni.model.BookInventory;

public class TestBookInventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookInventory bookInventory1 = new BookInventory();
		bookInventory1.setIsbn(1234567890123l);
		bookInventory1.setQuantity(10);
		
		System.out.println("ISBN = " + bookInventory1.getIsbn());
		System.out.println("Quantity = " + bookInventory1.getQuantity());

	}

}
