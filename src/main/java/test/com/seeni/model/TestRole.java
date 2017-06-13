package test.com.seeni.model;

import com.seeni.model.Role;

public class TestRole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Role role1 = new Role();
		
		role1.setId(201);
		role1.setRoleName("Author");
		
		System.out.println("ID = " + role1.getId());
		System.out.println("Role Name = " + role1.getRoleName());

	}

}
