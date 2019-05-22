package com.registraionprofile.javaProject;

public class UserProfile {

	private int userId;
	private String fname;
	private String lastName;
	private String phoneNumber;
	private String dateOfBirth;
	private String emailAddress;
	private String password;
	private String confirmPassword;

	public UserProfile(int userId, String fname, String lastName, String phoneNumber, String dateOfBirth,
			String emailAddress, String password, String confirmPassword) {

		this.userId = userId;
		this.fname = fname;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.emailAddress = emailAddress;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {

		this.phoneNumber = phoneNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "UserProfile [userId=" + userId + ", fname=" + fname + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", dateOfBirth=" + dateOfBirth + ", emailAddress=" + emailAddress + ", password="
				+ password + ", confirmPassword=" + confirmPassword + "]";
	}

}
