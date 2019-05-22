package com.registraionprofile.javaProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	private static Date date;

	public static void main(String[] args) throws ParseException {

		List<UserProfile> userList = new ArrayList<UserProfile>();

		Scanner input = new Scanner(System.in);

		System.out.println("Press I for input U for Update S for search D for delete user A for AllSearch ");

		String s = input.next();

		UserRepository userRepo = new UserRepository();

		if (s.equals("I")) {

			System.out.println("Enter User ID");
			int userId = input.nextInt();

			// Set first name

			System.out.println("Enter User First Name");
			String fname = input.nextLine();

			while (!fname.matches("[a-zA-z]+([ '-][a-zA-Z]+)*")) {

				System.out.println("retry your first Name");
				fname = input.nextLine();
			}

			// Set last name

			System.out.println("Enter User Last Name");
			String lname = input.nextLine();

			while (!lname.matches("[a-zA-z]+([ '-][a-zA-Z]+)*")) {

				System.out.println("retry your Last Name");
				lname = input.nextLine();
			}

			// Set Phone-Number

			System.out.println("Enter User Phone Number ");
			String regexStr = "^(?:(?:\\+?1\\s*(?:[.-]\\s*)?)?(?:\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?([0-9]{4})(?:\\s*(?:#|x\\.?|ext\\.?|extension)\\s*(\\d+))?$";

			String phone_number = input.nextLine();

			while (!phone_number.matches(regexStr)) {

				System.out.println("Enter Valid phone number");

				phone_number = input.nextLine();

			}

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

			// Set Email

			System.out.println("Enter you Email");
			String email = input.nextLine();

			String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

			while (!email.matches(regex)) {

				System.out.println("Enter email again");

				email = input.nextLine();
			}

			// Set Password

			System.out.println("Enter User Password");
			String passwordhere = input.next();

			String checkpasword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

			while (!passwordhere.matches(checkpasword)) {

				System.out.println("Enter password again");

				passwordhere = input.nextLine();
			}

			// Confirm password

			System.out.println("Confirm Password");
			String confirmhere = input.next();

			while (!confirmhere.contentEquals(passwordhere)) {

				System.out.println("your password does'nt match");
				confirmhere = input.next();
			}

			UserProfile user = new UserProfile(userId, fname, lname, phone_number, DOB, email, passwordhere,
					confirmhere);
			System.out.println(user);

			userRepo.addUser(user);
		}
		
		else if(s.equals("U")) {
			

			System.out.println("Enter User ID");
			int userId = input.nextInt();

			// Set first name

			System.out.println("Enter User First Name");
			String fname = input.nextLine();

			while (!fname.matches("[a-zA-z]+([ '-][a-zA-Z]+)*")) {

				System.out.println("retry your first Name");
				fname = input.nextLine();
			}

			// Set last name

			System.out.println("Enter User Last Name");
			String lname = input.nextLine();

			while (!lname.matches("[a-zA-z]+([ '-][a-zA-Z]+)*")) {

				System.out.println("retry your Last Name");
				lname = input.nextLine();
			}

			// Set Phone-Number

			System.out.println("Enter User Phone Number ");
			String regexStr = "^(?:(?:\\+?1\\s*(?:[.-]\\s*)?)?(?:\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?([0-9]{4})(?:\\s*(?:#|x\\.?|ext\\.?|extension)\\s*(\\d+))?$";

			String phone_number = input.nextLine();

			while (!phone_number.matches(regexStr)) {

				System.out.println("Enter Valid phone number");

				phone_number = input.nextLine();

			}

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

			// Set Email

			System.out.println("Enter you Email");
			String email = input.nextLine();

			String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

			while (!email.matches(regex)) {

				System.out.println("Enter email again");

				email = input.nextLine();
			}

			// Set Password

			System.out.println("Enter User Password");
			String passwordhere = input.next();

			String checkpasword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

			while (!passwordhere.matches(checkpasword)) {

				System.out.println("Enter password again");

				passwordhere = input.nextLine();
			}

			// Confirm password

			System.out.println("Confirm Password");
			String confirmhere = input.next();

			while (!confirmhere.contentEquals(passwordhere)) {

				System.out.println("your password does'nt match");
				confirmhere = input.next();
			}
			UserProfile userupdate=new UserProfile(userId, fname, lname, phone_number, DOB, email, passwordhere, confirmhere);
			userRepo.updateUser(userupdate);
		}

		
		else  if(s.equals("S")) 
		   { 
			   System.out.println("Enter user ID for search");
			   int searchById= input.nextInt();
			   System.out.println(userRepo.searchUesr(searchById));
		   }
		   
		  
		  //System.out.println(usr.getUserId()+" "+usr.getFname()+" "+usr.getLastName()
		//  +" "+usr.getPhoneNumber()+" "+usr.getDateOfBirth()+" "+usr.getEmailAddress()
		 //+" "+usr.getPassword()+" "+usr.getConfirmPassword()); }
		 

		  else	if (s.equals("D")) {

			System.out.println("Enter Id for remove user");
			int removeById = input.nextInt();
			userRepo.removeUser(removeById);

			// All User
		}

		else if (s.equals("A")) {
			userList = userRepo.showAllUser();

			for (UserProfile userList2 : userList) {

				System.out.println(userList2);
			}

		}

	}

}
