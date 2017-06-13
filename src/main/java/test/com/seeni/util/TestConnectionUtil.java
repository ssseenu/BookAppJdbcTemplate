package test.com.seeni.util;

import org.springframework.jdbc.core.JdbcTemplate;

import com.seeni.util.ConnectionUtil;

public class TestConnectionUtil {
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
		System.out.println(jdbcTemplate);
	}

}
