package test.com.seeni.model;

import com.seeni.model.BookRatings;

public class TestBookRatings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookRatings bookratings1 = new BookRatings();
		bookratings1.setIsbn(1234567890123l);
		bookratings1.setUserID(101);
		bookratings1.setRating(4.7);
		
		System.out.println("ISBN = " + bookratings1.getIsbn());
		System.out.println("User ID = " + bookratings1.getUserID());
		System.out.println("Ratings = " + bookratings1.getRating());
	}

}
