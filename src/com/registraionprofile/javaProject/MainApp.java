package com.registraionprofile.javaProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainApp {

	private static Date date;

	public static void main(String[] args) throws ParseException {

		Scanner input = new Scanner(System.in);

		UserProfile user = new UserProfile();

		// Set first name

		System.out.println("Enter User First Name");
		String fname = input.nextLine();

		while (!fname.matches("[a-zA-z]+([ '-][a-zA-Z]+)*")) {

			System.out.println("retry your first Name");
			fname = input.nextLine();
		}

		user.setFname(fname);

		// Set last name

		System.out.println("Enter User Last Name");
		String lname = input.nextLine();

		while (!lname.matches("[a-zA-z]+([ '-][a-zA-Z]+)*")) {

			System.out.println("retry your Last Name");
			lname = input.nextLine();
		}
		user.setLastName(lname);

		// Set Phone-Number

		System.out.println("Enter User Phone Number ");
		String regexStr = "^(?:(?:\\+?1\\s*(?:[.-]\\s*)?)?(?:\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?([0-9]{4})(?:\\s*(?:#|x\\.?|ext\\.?|extension)\\s*(\\d+))?$";

		String phone_number = input.nextLine();

		while (!phone_number.matches(regexStr)) {

			System.out.println("Enter Valid phone number");

			phone_number = input.nextLine();

		}

		user.setPhoneNumber(phone_number);

		// Set Date of birth

		System.out.println("Enter User Date Of Birth");
		String DOB = input.nextLine();
		date = new SimpleDateFormat("MM-dd-yyyy").parse(DOB);

		if (!(DOB.length() == 0)) {
			System.out.println(date);
		} else {
			System.out.println("Enter Valid formatfor Date of Birth MM-dd-yyyy");
			date = new SimpleDateFormat("MM-dd-yyyy").parse(DOB);
		}

		user.setDateOfBirth(DOB);

		// Set Email

		System.out.println("Enter you Email");
		String email = input.nextLine();

		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

		while (!email.matches(regex)) {

			System.out.println("Enter email again");

			email = input.nextLine();
		}

		user.setEmailAddress(email);

		// Set Password

		System.out.println("Enter User Password");
		String passwordhere = input.next();

		String checkpasword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

		while (!passwordhere.matches(checkpasword)) {

			System.out.println("Enter password again");

			passwordhere = input.nextLine();
		}

		user.setPassword(passwordhere);

		// Confirm password

		System.out.println("Confirm Password");
		String confirmhere = input.next();

		while (!confirmhere.contentEquals(passwordhere)) {

			System.out.println("your password does'nt match");
			confirmhere = input.next();
		}

		user.setConfirmPassword(confirmhere);
}


		System.out.println(user);

		/*
		 * Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]",
		 * Pattern.CASE_INSENSITIVE); Pattern UpperCasePatten =
		 * Pattern.compile("[A-Z ]"); Pattern lowerCasePatten =
		 * Pattern.compile("[a-z ]"); Pattern digitCasePatten =
		 * Pattern.compile("[0-9 ]");
		 * 
		 * 
		 * 
		 * if (!passwordhere.equals(confirmhere)) {
		 * System.out.println("password and confirm password does not match"); } if
		 * (passwordhere.length() < 8) {
		 * System.out.println("Password lenght must have alleast 8 character !!");
		 * 
		 * } if (!specailCharPatten.matcher(passwordhere).find()) {
		 * System.out.println("Password must have atleast one specail character !!");
		 * 
		 * } if (!UpperCasePatten.matcher(passwordhere).find()) {
		 * System.out.println("Password must have atleast one uppercase character !!");
		 * } if (!lowerCasePatten.matcher(passwordhere).find()) {
		 * System.out.println("Password must have atleast one lowercase character !!");
		 * } if (!digitCasePatten.matcher(passwordhere).find()) {
		 * System.out.println("Password must have atleast one digit character !!"); }
		 * 
		 */

	}

}
