package com.registraionprofile.javaProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

			if (ps.executeUpdate() == 1) {
				return Result.SUCCESS;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Result.FAILURE;

	}

}
