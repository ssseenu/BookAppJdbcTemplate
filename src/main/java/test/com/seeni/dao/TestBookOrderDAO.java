package test.com.seeni.dao;

import java.time.LocalDate;

import com.seeni.dao.BookOrderDAO;
import com.seeni.model.BookSales;

public class TestBookOrderDAO {
public static void main(String[] args) {
		
	BookSales bookSales = new BookSales();
	bookSales.setSalesID(1001);
	bookSales.setUserID(101);
	bookSales.setIsbn(1234567890123l);
	bookSales.setQuantity(3);
	bookSales.setPrice(250.00);
	bookSales.setTotalAmount(bookSales.getPrice() * bookSales.getQuantity());
	bookSales.setOrderDate(LocalDate.parse("2017-06-09"));
	bookSales.setStatus("Shipped");
	
	BookOrderDAO bookOrderDAO = new BookOrderDAO();
	
	/* User can able to view the available books and place an order */
	try {
		bookOrderDAO.orderBook(bookSales);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	/* User can select the quantity of books */ 
	try {
		bookOrderDAO.selectQuantity(bookSales);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	/* User can cancel the book order */
	try {
		bookOrderDAO.cancelOrder(bookSales);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
		
}
