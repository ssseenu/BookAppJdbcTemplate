package test.com.seeni.dao;

import java.time.LocalDate;

import com.seeni.dao.AuthorDAO;
import com.seeni.model.Book;

public class TestAuthorDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.setIsbn(1234567890123l);
		book1.setTitle("Wings Of Fire");
		book1.setAuthor("Dr.A.P.J.Abdul kalam");
		book1.setPublishDate(LocalDate.parse("1995-02-11"));
		book1.setContent("Wings Of Fire is a autobiography of Dr.A.P.J.Abdul kalam");
		book1.setPrice(500);
		book1.setStatus("published");
		
		AuthorDAO author = new AuthorDAO();
		
		
		/* Author can create a book */
		try {
			author.insertBook(book1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Author can upload the contents of book */
		try {
			author.updateContent(book1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Author can view the book and contents */
		try {
			author.viewBook(book1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Author can delete the book */
		try {
			author.deleteBook(book1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Author can view all his books */
		try {
			author.viewAllBooks(book1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
