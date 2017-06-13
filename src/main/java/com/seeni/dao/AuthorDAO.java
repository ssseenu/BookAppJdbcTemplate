package com.seeni.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.seeni.model.Book;
import com.seeni.util.ConnectionUtil;

public class AuthorDAO {
/* Author can create a book */
	
	public void insertBook(Book book) throws Exception {
	 
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

		// 2. Query
		String sql = "insert into book (isbn , title, author , publishDate ,content , price , status) values (?,?,?,?,?,?,?)";

		// 3. Set the input and Query execute
		int rows = jdbcTemplate.update(sql, book.getIsbn(), book.getTitle(), book.getAuthor(), book.getPublishDate(), book.getContent(), book.getPrice(), book.getStatus());
		System.out.println("No of rows inserted: " + rows);
	}

	/* Author can upload the contents of book */
	
	public void updateContent(Book book) throws Exception {
		
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

		// 2. Query
		String sql = "update book set `content`=? where `isbn`=?";
		
		// 3. Set the input and Query execute
		int rows = jdbcTemplate.update(sql, book.getContent(), book.getIsbn());
		System.out.println("No. of rows Updated : " + rows);
	}

	/* Author can view the book and contents */
	
	public void viewBook(Book book) throws Exception {
		
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

		// 2. Query
		String sql = "select title,content from book where (isbn = ?)";
		
		// 3. Set the input and Query execute
		List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class), book.getIsbn());
		System.out.println(books);;
	}

	/* Author can delete the book */
	
	public void deleteBook(Book book) throws Exception {
		
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

		// 2. Query
		String sql = "delete from book where isbn = ?";
		
		// 3. Set the input and Query execute
		int rows = jdbcTemplate.update(sql, book.getIsbn());
		System.out.println("No. of rows Deleted : " + rows);
	}

	/* Author can view all his books */
	
	public void viewAllBooks(Book book) throws Exception {
		
		// Step 1:Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

		// Step 2: Query
		String sql = "select * from book where author = ?";
		
		// 3. Set the input and Query execute
		List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class), book.getAuthor());
		System.out.println(books);;
	}



}
