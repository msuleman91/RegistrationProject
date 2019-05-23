package com.registraionprofile.javaProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.domain.anumjava.Result;
import com.mysql.jdbc.PreparedStatement;

public class UserRepository {

	Connection connection;

	public UserRepository() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegistrationDatabase", "root",
					"rootpasswordgiven");

			System.out.println("Connection successful");
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

	// add the User
	public Result addUser(UserProfile userDetail) {

		try {

			PreparedStatement ps = (PreparedStatement) this.connection.prepareStatement(
					"insert into UserProfile (id, firstname, lastname,phonenumber,dateOfBirth,emailAddress,password,confirmPassword) values (?,?,?,?,?,?,?,?)");
			ps.setInt(1, userDetail.getUserId());
			ps.setString(2, userDetail.getFname());
			ps.setString(3, userDetail.getLastName());
			ps.setString(4, userDetail.getPhoneNumber());
			ps.setString(5, userDetail.getDateOfBirth());
			ps.setString(6, userDetail.getEmailAddress());
			ps.setString(7, userDetail.getPassword());
			ps.setString(8, userDetail.getConfirmPassword());
			
			int i=ps.executeUpdate();

			if (i == 1) {
				System.out.println("Update successfully");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Result.FAILURE;

	}

//Update User
	public Result updateUser(UserProfile userDetail) {

		try {
		//	String updateTableSQL = "UPDATE UserProfile SET firstname = ?,lastname=?,phonenumber=?,dateOfBirth=?,emailAddress=?,password=?,confirmPassword=?"
			//		+ " WHERE id= ?";
			PreparedStatement ps = (PreparedStatement) this.connection.prepareStatement("UPDATE UserProfile SET firstname = ?,lastname=?,phonenumber=?,dateOfBirth=?,emailAddress=?,password=?,confirmPassword=?"
					+ " WHERE id= ?");

			ps.setInt(1, userDetail.getUserId());
			ps.setString(2, userDetail.getFname());
			ps.setString(3, userDetail.getLastName());
			ps.setString(4, userDetail.getPhoneNumber());
			ps.setString(5, userDetail.getDateOfBirth());
			ps.setString(6, userDetail.getEmailAddress());
			ps.setString(7, userDetail.getPassword());
			ps.setString(8, userDetail.getConfirmPassword());

			if (ps.executeUpdate() == 1) {

				return Result.SUCCESS;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Result.FAILURE;

	}

	// Delete user by ID
	public Result removeUser(int id) {

		try {
			PreparedStatement ps = (PreparedStatement) connection
					.prepareStatement("DELETE FROM UserProfile where id=?");

			ps.setInt(1, id);
			int i = ps.executeUpdate();

			if (i == 1) {
				System.out.println("Succesfully removed");
				;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Result.FAILURE;

	}

	// Search the user by ID
	public UserProfile searchUesr(int id) {

		try {
			PreparedStatement ps = (PreparedStatement) this.connection
					.prepareStatement("Select *from UserProfile where id=?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				UserProfile user = new UserProfile(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));

				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public List<UserProfile> showAllUser() {

		try {
			List<UserProfile> userList = new ArrayList<UserProfile>();
			PreparedStatement ps = (PreparedStatement) connection.prepareStatement("Select *from UserProfile");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				UserProfile user = new UserProfile(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));

				userList.add(user);

			}
			return userList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
}
