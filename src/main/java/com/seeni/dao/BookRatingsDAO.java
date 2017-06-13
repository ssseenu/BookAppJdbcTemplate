package com.seeni.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.seeni.model.BookRatings;
import com.seeni.util.ConnectionUtil;

public class BookRatingsDAO {
/* Users can provide ratings for the book */
	
	public void addRating(BookRatings bookRatings) throws Exception {
		// Step 1:Get the connection
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        
        // Step 2: Query
		String sql = "update bookRatings set rating = ? where isbn = ?";
		
		// 3. Set the input and Query execute
		int rows = jdbcTemplate.update(sql, bookRatings.getRating(), bookRatings.getIsbn());
		System.out.println("No of rows updated : " + rows);
	}

}
