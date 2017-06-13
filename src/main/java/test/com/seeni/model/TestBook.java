package test.com.seeni.model;

import java.time.LocalDate;

import com.seeni.model.Book;

public class TestBook {
	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.setIsbn(1234567890123l);
		book1.setTitle("Wings Of Fire");
		book1.setAuthor("Dr.A.P.J.Abdul kalam");
		book1.setPublishDate(LocalDate.parse("1995-02-11"));
		book1.setContent("Wings Of Fire is a autobiography of Dr.A.P.J.Abdul kalam");
		book1.setPrice(500);
		book1.setStatus("published");
			
			System.out.println(book1.toString());
		}
	

}
