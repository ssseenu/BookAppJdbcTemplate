package test.com.seeni.dao;

import com.seeni.dao.BookInventoryDAO;
import com.seeni.model.BookInventory;

public class TestBookInventoryDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookInventory bookInventory = new BookInventory();
		bookInventory.setIsbn(1234567890123l);
		bookInventory.setQuantity(5);
		
		BookInventoryDAO bookInventoryDAO = new BookInventoryDAO();
		
		/*Admin can increase the quantity of Books */
		try {
			bookInventoryDAO.increaseQuantity(bookInventory);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Once the stock is not available, user should not be able to place an order */
		try {
			bookInventoryDAO.availableStock(bookInventory);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
