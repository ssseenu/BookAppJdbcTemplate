package test.com.seeni.model;

import java.time.LocalDate;

import com.seeni.model.BookSales;

public class TestBookSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookSales bookSales1 = new BookSales();
		
		bookSales1.setSalesID(1001);
		bookSales1.setUserID(101);
		bookSales1.setIsbn(1234567890123l);
		bookSales1.setQuantity(3);
		bookSales1.setPrice(250.00);
		bookSales1.setTotalAmount(bookSales1.getPrice() * bookSales1.getQuantity());
		bookSales1.setOrderDate(LocalDate.parse("2017-06-09"));
		bookSales1.setStatus("Shipped");
		
		System.out.println("Sales ID = " + bookSales1.getSalesID());
		System.out.println("User ID = " + bookSales1.getUserID());
		System.out.println("ISBN = " + bookSales1.getIsbn());
		System.out.println("Quantity = " + bookSales1.getQuantity());
		System.out.println("Price = " + bookSales1.getPrice());
		System.out.println("Total Amount = " + bookSales1.getTotalAmount());
		System.out.println("Order Date = " + bookSales1.getOrderDate());
		System.out.println("Status = " + bookSales1.getStatus());


	}

}
