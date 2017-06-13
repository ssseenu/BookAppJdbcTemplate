package test.com.seeni.dao;

import com.seeni.dao.BookRatingsDAO;
import com.seeni.model.BookRatings;

public class TestBookRatingsDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookRatings bookratings = new BookRatings();
		bookratings.setIsbn(1234567890123l);
		bookratings.setUserID(101);
		bookratings.setRating(4.5);
		
		BookRatingsDAO bookRatingsDAO = new BookRatingsDAO();
		
		/* Users can provide ratings for the book */
		try {
			bookRatingsDAO.addRating(bookratings);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
