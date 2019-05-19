package com.registraionprofile.javaProject;

public class UserProfile {

	private String fname;
	private String lastName;
	private String phoneNumber;
	private String dateOfBirth;
	private String emailAddress;
	private String password;
	private String confirmPassword;

	public UserProfile() {

		fname = null;
		lastName = null;
		phoneNumber = null;
		dateOfBirth = null;
		emailAddress = null;
		password = null;
		confirmPassword = null;

	}

	// Constructor overloading

	/*
	 * public UserProfile(String fname, String lastName, String phoneNumber, int
	 * dateOfBirth, String emailAddress, String password, String confirmPassword) {
	 * 
	 * this.fname = fname; lastName = lastName; phoneNumber = phoneNumber;
	 * dateOfBirth = dateOfBirth; emailAddress = emailAddress; password = password;
	 * confirmPassword = confirmPassword; }
	 */

	

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
		return "UserProfile [fname=" + fname + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", dateOfBirth=" + dateOfBirth + ", emailAddress=" + emailAddress + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}


}
