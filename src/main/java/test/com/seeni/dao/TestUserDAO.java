package test.com.seeni.dao;

import com.seeni.dao.UserDAO;
import com.seeni.model.User;

public class TestUserDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User();
		user1.setId(101);
		user1.setName("Seenu");
		user1.setUserName("seenusssg");
		user1.setPassword("sssg");
		user1.setMobileNumber(9876543210l);
		user1.setEmailID("sssg@gmail.com");
		user1.setActive("A");
		user1.setRoleId(101);
		
		UserDAO userDAO = new UserDAO();
		
		/* New User Can Register */
		try {
			userDAO.insertUser(user1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* User must be able to Login */
		try {
			userDAO.loginUser(user1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* User must be able to Reset Password */
		try {
			userDAO.updatePassword(user1, "sankar7849");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
